public class GraphActivity extends AppCompatActivity {

	Button btnWelcome, btnToday, btnFood, btnGraph, btnProfile;
	
	GraphView gv; //This code uses graphview implementation. If there is something better please use that instead
//In Gradle Scripts > build.gradle(Module:app) under dependencies
// add "implementation 'com.jjoe64:graphview:4.2.2'"
//Again, if anything else is better feel free to use that instead

//xml should look like this:
//  <com.jjoe64.graphview.GraphView
		.../>
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
		
		btnWelcome = findViewById(R.id.button);
		btnToday = findViewById(R.id.button2);
		btnFood	= findViewById(R.id.button3);
		btnGraph = findViewById(R.id.button4);
		btnProfile = findViewById(R.id.button5);
		
		gv = findViewById(R.id.GraphView);
		
		LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
			new DataPoint(x,y),
			new DataPoint(x,y),
			new DataPoint(x,y),
			...
		});
		
		gv.setTitle("Calorie Graph");
		gv.setTitleColor(#xxxxx);
		gv.setTitleTextSize(18);
		gv.addSeries(series);
		
}

	//MainActivity action
	public void onClick(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	//Today's diet action
	public void on2Click(View v){
		Intent intent = new Intent(this, DietActivity.class);
		startActivity(intent);
	}
	//Food items action
	public void on3Click(View v){
		Intent intent = new Intent(this, FoodActivity.class);
		startActivity(intent);
	}
	//Graph action
	public void on4Click(View v){
		Intent intent = new Intent(this, GraphActivity.class);
		startActivity(intent);
	}
	//Profile action
	public void on5Click(View v){
		Intent intent = new Intent(this, ProfileActivity.class);
		startActivity(intent);
	}
}