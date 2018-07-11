package cubex.mahesh.actvtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val values =  resources.getStringArray(R.array.countries)
    // var values = arrayOf("Sri lanka","Saudi Arebia","South Africa")
      val myadapter = ArrayAdapter<String> (this,
             android.R.layout.simple_list_item_single_choice,
              values)
     actv.setAdapter(myadapter)
     actv.threshold = 1
    }
}
