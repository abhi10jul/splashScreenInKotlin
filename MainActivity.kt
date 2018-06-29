package www.abhishek.com.kotlin



import android.os.Bundle

import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*



/**

 * Created by abhishek

 * https://abhiandroidknowledge.blogspot.com/2018/03/splashscreen.html

 * */



class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //call textview to id 

        tv_splashScreen.setText("Replace own code")



    }



}
