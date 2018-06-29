package www.abhishek.com.kotlin

import android.content.Intent

import android.os.Bundle

import android.support.v7.app.AppCompatActivity





/**

 * Created by abhishek

 * https://abhiandroidknowledge.blogspot.com/2018/03/splashscreen.html

 * */



class SplashScreen : AppCompatActivity() {



    private val SPLASH_TIME:Long = 5000 // 5 second

    // inner class intialise
    private var intentLaucher: IntentLaucher? = null 



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.splash_screen)



        intentLaucher = IntentLaucher() // create inner class object

        intentLaucher!!.start() // call thread



    }



    /**

     * IntentLuncher to extends Thread and implement run method

     */

    inner class IntentLaucher : Thread() {



        override fun run() {

            try {

                Thread.sleep(SPLASH_TIME)

            } catch (e: InterruptedException) {

                e.printStackTrace()

            }



            startActivity(Intent(this@SplashScreen,MainActivity::class.java))

            finish()

        }

    }

}
