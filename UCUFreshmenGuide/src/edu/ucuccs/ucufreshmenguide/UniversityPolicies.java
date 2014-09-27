package edu.ucuccs.ucufreshmenguide;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardView;

import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class UniversityPolicies extends SherlockFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.university_policies,
				container, false);

		DatabaseHandler db = new DatabaseHandler(getActivity());

		// INSERT POLICY
		db.addPolicy(new Policy("VISION","A transformative, self-reliant, and dynamic university recognized as a center of excellence with globally competative professionals an distinctive capabilities in research, extension, and production."));
		db.addPolicy(new Policy("MISSION", "A university that shall provide advanced instruction in the field of arts, sciences, teacher education, technical entrepreneurship and establish a strong research culture with active involvement in extension and production activities."));
		db.addPolicy(new Policy("GOALS", "The university aims to contribute to the attainment of national development goals through character building, academic excellence, promotion and enrichment of the Filipino historical and cultural heritage and preservation of environment."));

		// READ ALL CONTACTS

		List<Policy> policy = db.getAllPolicy();

		// LOOP THROUGH CONTACTS
		for (Policy cn : policy) {

			String log = cn.getName()
					+ "   " + cn.getDescription();
			
			// Create a Card
			Card card = new Card(getActivity(), R.layout.row_card);
			
			// Create a CardHeader
			CardHeader header = new CardHeader(getActivity());
			header.setTitle("University VMGO");
			card.setTitle(log);
			
			// Add Header to card
			card.addCardHeader(header);
			
			// Set card in the cardView
			CardView cardView = (CardView) rootView.findViewById(R.id.card);
			cardView.setCard(card);

			/*Toast.makeText(getActivity(), log, Toast.LENGTH_SHORT).show();*/

		}

		return rootView;
	}

}