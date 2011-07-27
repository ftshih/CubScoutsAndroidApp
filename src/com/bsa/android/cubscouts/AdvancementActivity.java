package com.bsa.android.cubscouts;

import com.bsa.android.R;
import com.bsa.android.cubscouts.bobcat.BobcatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdvancementActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.advancement);
		
		Button bobCatsButton = (Button) findViewById(R.id.bobcats);
		bobCatsButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent bobIntent = new Intent(v.getContext(),com.bsa.android.cubscouts.bobcat.BobcatActivity.class);
				startActivity(bobIntent);
			}
		});
	}

}
