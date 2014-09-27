package edu.ucuccs.ucufreshmenguide;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.view.CardView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class TabNews extends SherlockFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.tab_news, container, false);

		// Create a Card
		Card card = new Card(getActivity(), R.layout.row_card);

		// Create a CardHeader
		CardHeader header = new CardHeader(getActivity());
		header.setTitle("University City University News");

		card.setTitle("University News Here");
		CardThumbnail thumb = new CardThumbnail(getActivity());
		thumb.setDrawableResource(R.drawable.ic_launcher);

		card.addCardThumbnail(thumb);

		// Add Header to card
		card.addCardHeader(header);

		// Set card in the cardView
		CardView cardView = (CardView) rootView.findViewById(R.id.carddemo);
		cardView.setCard(card);
		
		
		
		
		return rootView;
	}

}