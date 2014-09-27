package edu.ucuccs.ucufreshmenguide;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

	// DATABASE VERSION
	private static final int DATABASE_VERSION = 1;

	// DATABASE NAME
	private static final String DATABASE_NAME = "dbpolicy";

	// TABLE NAME
	private static final String TABLE_POLICY = "tblpolicy";

	// COLUMN NAMES OF TABLE_CONTACTS
	private static final String FIELD_ID = "policy_id";
	private static final String FIELD_NAME = "policy_name";
	private static final String FIELD_DESC = "policy_description";

	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	// CREATING TABLES
	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_POLICY_TABLE = "CREATE TABLE " + TABLE_POLICY + "("
				+ FIELD_ID + " INTEGER PRIMARY KEY," + FIELD_NAME + " TEXT,"
				+ FIELD_DESC + " TEXT" + ")";
		db.execSQL(CREATE_POLICY_TABLE);
	}

	// UPGRADING DATABASE
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// DROP OLDER TABLE IF EXISTED
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_POLICY);

		// CREATE TABLES AGAIN
		onCreate(db);
	}

	// METHOD FOR ADDING POLICY
	void addPolicy(Policy policy) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(FIELD_NAME, policy.getName());
		values.put(FIELD_DESC, policy.getDescription());

		// INSERTING ROW
		db.insert(TABLE_POLICY, null, values);
		db.close();
	}

	// SELECT SINGLE CONTACT
	Policy getPolicy(int id) {
		SQLiteDatabase db = this.getReadableDatabase();
		// SELECT WHERE QUERY
		Cursor cursor = db.query(TABLE_POLICY, new String[] { FIELD_ID,
				FIELD_NAME, FIELD_DESC }, FIELD_ID + "=?",
				new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		Policy policy = new Policy(Integer.parseInt(cursor.getString(0)),
				cursor.getString(1), cursor.getString(2));
		// return contact
		return policy;
	}

	// SELECT ALL POLICY
	public List<Policy> getAllPolicy() {
		List<Policy> policyList = new ArrayList<Policy>();
		// SELECT ALL QUERY
		String selectQuery = "SELECT  * FROM " + TABLE_POLICY;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Policy policy = new Policy();
				policy.setID(Integer.parseInt(cursor.getString(0)));
				policy.setName(cursor.getString(1));
				policy.setDescription(cursor.getString(2));

				// Adding policy to list
				policyList.add(policy);
			} while (cursor.moveToNext());
		}

		return policyList;
	}

	// UPDATING A POLICY
	public int updatePolicy(Policy policy) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(FIELD_NAME, policy.getName());
		values.put(FIELD_DESC, policy.getDescription());

		// updating row
		return db.update(TABLE_POLICY, values, FIELD_ID + " = ?",
				new String[] { String.valueOf(policy.getID()) });
	}

	// DELETING A POLICY
	public void deletePolicy(Policy policy) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_POLICY, FIELD_ID + " = ?",
				new String[] { String.valueOf(policy.getID()) });
		db.close();
	}

	// GETTING THE TOTAL POLICY
	public int getPolicyCount() {
		String countQuery = "SELECT  * FROM " + TABLE_POLICY;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

}
