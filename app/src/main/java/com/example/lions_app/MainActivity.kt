package com.example.lions_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  1. 화면이 클릭되었다는 것을 프로그램이 알아야 함
        val image1 = findViewById<ImageView>(R.id.lions_image_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            //  2. 화면이 클릭되면 다음 화면으로 넘어가서 사진을 크게 보여줌
            val intent = Intent(this, Lions1Activity::class.java)
            startActivity(intent)
        }

        //10개 이미지들의 이름을 다 붙이고, 각각 클릭 시 다른 액티비티로 이동
        val image2 = findViewById<ImageView>(R.id.lions_image_2)
        val image3 = findViewById<ImageView>(R.id.lions_image_3)
        val image4 = findViewById<ImageView>(R.id.lions_image_4)
        val image5 = findViewById<ImageView>(R.id.lions_image_5)
        val image6 = findViewById<ImageView>(R.id.lions_image_6)
        val image7 = findViewById<ImageView>(R.id.lions_image_7)
        val image8 = findViewById<ImageView>(R.id.lions_image_8)
        val image9 = findViewById<ImageView>(R.id.lions_image_9)
        val imagep = findViewById<ImageView>(R.id.lions_image_p)

        image2.setOnClickListener{
            val intent = Intent(this, Lions2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            val intent = Intent(this, Lions3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            val intent = Intent(this, Lions4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            val intent = Intent(this, Lions5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            val intent = Intent(this, Lions6Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            val intent = Intent(this, Lions7Activity::class.java)
            startActivity(intent)
        }

        image8.setOnClickListener {
            val intent = Intent(this, Lions8Activity::class.java)
            startActivity(intent)
        }

        image9.setOnClickListener {
            val intent = Intent(this, Lions9Activity::class.java)
            startActivity(intent)
        }

        imagep.setOnClickListener {
            val intent = Intent(this, LionsPActivity::class.java)
            startActivity(intent)
        }





    }


}