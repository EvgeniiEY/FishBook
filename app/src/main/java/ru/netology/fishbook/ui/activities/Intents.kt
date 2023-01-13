package ru.netology.fishbook.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.netology.fishbook.R
import java.io.File

class Intents : AppCompatActivity() {
    @SuppressLint("IntentReset")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)
        val btn1 = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener {
            //явное намерение запуск активности
            val intent = Intent(this, Intents2::class.java)

//            val number = "23454568678"
//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:$number")
            startActivity(intent)
        }
        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            //НЕявное намерение
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://ya.ru/"))
            startActivity(intent)
        }
        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            //контакты открыть
            val intent = Intent(
                Intent.ACTION_PICK,
                android.provider.ContactsContract.Contacts.CONTENT_URI
            )
            startActivity(intent)
        }
        val btn4 = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener {
            //расшарить контент
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_SUBJECT, "ТЕМА КОНТЕНТА")
            intent.putExtra(Intent.EXTRA_TEXT, "ТЕКСТ КОНТЕНТА")
            startActivity(intent)
        }
        val btn5 = findViewById<Button>(R.id.button5)
        btn5.setOnClickListener {
            //расшарить контент
            val latitude = 21.624730160386385
            val longitude = 107.90381220449397
            val uri = "geo:$latitude,$longitude"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
//            intent.type = "text/plain"

            startActivity(intent)
        }


    }
}