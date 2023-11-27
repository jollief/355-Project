public class LoadScreenActivity extends AppCompatActivity {
	
	Timer timer;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_screen);
		
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Intent intent = new Intent(LoadScreenActivity.this, MainActivity.class);
				startActivity(intent);
				finish();
			}
		}, 5000);
	}
}

//Manifest File


//		  <activity
//            android:name=".LoadScreenActivity"
//            android:exported="true">
//            <intent-filter>
//                <action android:name="android.intent.action.MAIN" />
//
//                <category android:name="android.intent.category.LAUNCHER" />
//            </intent-filter>
//        </activity>