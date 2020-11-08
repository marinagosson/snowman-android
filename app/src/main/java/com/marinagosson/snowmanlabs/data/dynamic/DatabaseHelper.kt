package com.marinagosson.snowmanlabs.data.dynamic

import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.marinagosson.snowmanlabs.data.model.FAQ
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Classe do banco de dados local
 */
@Database(
    entities = [FAQ::class],
    version = 1
)
abstract class DatabaseHelper : RoomDatabase() {
    abstract fun faqDap() : FAQDao

    companion object {
        private const val DB_NAME = "snowmanlabs_database"
        private var instance: DatabaseHelper? = null

        fun getInstance(context: Context): DatabaseHelper {
            if(instance == null || !instance!!.isOpen ){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    DatabaseHelper::class.java,
                    DB_NAME
                ).fallbackToDestructiveMigration()
                    .addCallback(DatabaseHelperCallback())

                    .build()
            }
            return instance!!
        }

        private class DatabaseHelperCallback() : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                instance?.let { databaseHelper -> {
                    populateDatabase(databaseHelper.faqDap())
                } }
            }

            fun populateDatabase(faqDao: FAQDao){
                Log.i("DatabaseHelper", "Populando os dados")
                faqDao.insert(FAQ(question = "Em qual data foi fundada a Snowman Labs?", anwser = "A Snowman Labs foi fundada no dia 9 de agosto de 2012. ", color = 0, uid = 1))
                faqDao.insert(FAQ(question = "Qual foi o primeiro cliente/ projeto que a Snow teve?", anwser = "O primeiro cliente que a Snow teve foi um candidato a deputado federal e fizemos o projeto dos santinhos digitais. Foi entregue em setembro de 2012.", color = 0, uid = 2))
                faqDao.insert(FAQ(question = "Por que foi escolhido o nome Snowman Labs? ", anwser = "Por conta da neve em Curitiba que ocorreu em 2013. Queríamos um mascote e a partir dele, surgiu o nome (foi a primeira coisa que pensamos na época). ", color = 0, uid = 3))
            }
        }
    }

}