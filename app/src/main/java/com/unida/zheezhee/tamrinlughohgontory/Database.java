package com.unida.zheezhee.tamrinlughohgontory;

/**
 * Created by zhee-zhee on 07/12/2016.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";

    public Database(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "مَا هٰذَا؟");
        values.put("pil_a", "هٰذَا كِتَابٌ");
        values.put("pil_b","هٰذَا مَقْعَدٌ");
        values.put("pil_c",  "هٰذَا قَلَمٌ");
        values.put("jwban", "1");
        values.put("img", R.drawable.bangku);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "مَا ذٰلِكَ؟");
        values.put("pil_a","ذٰلِكَ مَكْتَبٌ");
        values.put("pil_b","ذٰلِكَ كِتَابٌ");
        values.put("pil_c",  "ذٰلِكَ قَلَمٌ");
        values.put("jwban", "1");
        values.put("img", R.drawable.kitab);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "أَ هٰذِهِ مِكْنَسَةٌ؟");
        values.put("pil_a", "نَعَمْ, ذٰلِكَ مِكْنَسَةٌ");
        values.put("pil_b", "نَعَمْ, هٰذَا مِكْنَسَةٌ");
        values.put("pil_c", "نَعَمْ, هٰذِهِ مِكْنَسَةٌ");
        values.put("jwban", "2");
        values.put("img", R.drawable.sapu);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "مَا هٰذِهِ؟");
        values.put("pil_a", "هٰذِهِ نَافِذَةٌ");
        values.put("pil_b", "هٰذِهِ مِمْحَاةٌ");
        values.put("pil_c", "هٰذِهِ مِنَشَّةٌ");
        values.put("jwban", "2");
        values.put("img", R.drawable.kemoceng);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "مَا هٰذِهِ؟");
        values.put("pil_a", "هٰذِهِ خَرِيْطَةٌ");
        values.put("pil_b", "هٰذِهِ مُثَلَّثٌ");
        values.put("pil_c", "هٰذِهِ مِنْقَلَةٌ");
        values.put("jwban", "0");
        values.put("img", R.drawable.peta);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "مَا تِلْكَ ؟");
        values.put("pil_a", "هٰذَا فِرْجَارٌ");
        values.put("pil_b", "تِلْكَ مُؤَشِّرٌ");
        values.put("pil_c", "هٰذِهِ نَافِذَةٌ");
        values.put("jwban", "2");
        values.put("img", R.drawable.jendela);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "أَيْنَ التَّقْوِيْمُ؟");
        values.put("pil_a", "التَّقْوِيْمُ هُنَاكَ");
        values.put("pil_b", "نَعَمْ, ذٰلِكَ التَّقْوِيْمُ");
        values.put("pil_c", "لاَ, بَلْ هُنَاكَ");
        values.put("jwban", "0");
        values.put("img", R.drawable.tanggal);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "هَلْ هُنَاكَ فِنَاءٌ؟");
        values.put("pil_a", "لَا, بَلْ هُنَاكَ جِدَارٌ");
        values.put("pil_b", "نَعَمْ, هُنَاكَ فِنَاءٌ");
        values.put("pil_c", "لَا, بَلْ هُنَاكَ طَلَّاسَةٌ");
        values.put("jwban", "2");
        values.put("img", R.drawable.penghapuspapan);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "أَيْنَ الْأُسْتَاذُ؟");
        values.put("pil_a", "الْأُسْتَاذُ وَرَاءَ الْمِسْطَرَةِ ");
        values.put("pil_b", "الْأُسْتَاذُ تَحْتَ الْمَكْتَبِ");
        values.put("pil_c", "الْأُسْتَاذُ بَيْنَ السَّبُّوْرَةِ وَ الْمَكْتَبِ");
        values.put("jwban", "2");
        values.put("img", R.drawable.guru);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", ".......  ؟عَلَيْهِ وِسَادَةٌ");
        values.put("pil_a", "مَاذَا عَلىَ السَّرِيْرِ؟");
        values.put("pil_b", "مَاذَا عَلَى الْمِنْضَدَةِ؟");
        values.put("pil_c", "مَنْ عَلَى السَّرِيْرِ؟");
        values.put("jwban", "0");
        values.put("img", R.drawable.kasur);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "أَيْنَ قَلَمُكَ؟");
        values.put("pil_a", "هُوَ فِيْ الْمِبْرَاةِ");
        values.put("pil_b", "هُوَفِيْ الْمَنْدِيْلِ");
        values.put("pil_c", "هُوَ فِيْ الْجَيْبِ");
        values.put("jwban", "2");
        values.put("img", R.drawable.kantong);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "لَا, تِلْكَ الْمِبْرَةُ لِأَحْمَدَ");
        values.put("pil_a", "أَ هٰذِهِ الْمبْرَةُ لَكَ؟");
        values.put("pil_b", "أَيْنَ قَلَمُ لِأَحْمَدَ؟");
        values.put("pil_c", "مَاذَا لِأَحْمَدَ؟");
        values.put("jwban", "0");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "....؟ هُوَ لِلتِّلْمِيْذِ");
        values.put("pil_a", "هَلْ ذٰلِكَ الْقَلَمُ لِلْأُسْتَاذِ؟");
        values.put("pil_b", "لِمَنِ الْبِئْرُ؟");
        values.put("pil_c", "لِمَنْ ذٰلِكَ الْكِتَابُ؟");
        values.put("jwban", "2");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "مَاذَا بَيْنَ السَّاحَةِ وَ الْبُسْتَانِ؟");
        values.put("pil_a", "بَيْنَ السَّاحَةِ وَ الْبُسْتَانِ حَشِيَّةٌ");
        values.put("pil_b", "بَيْنَ السَّاحَةِ وَ الْبُسْتَانِ سُوْرٌ");
        values.put("pil_c", "بَيْنَ السَّاحَةِ وَ البُسْتَانِ لِحَافٌ");
        values.put("jwban", "1");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "عَلَى الْمَكْتَبِ (4 pulpen)");
        values.put("pil_a", "عَلَى الْمَكْتَبِ أَرْبَعَةُ أَقْلَامٍ");
        values.put("pil_b", "عَلَى الْمَكْتَبِ أَرْبَعَةُ قَلَمًا");
        values.put("pil_c", "عَلَى الْمَكْتَبِ أرْبَعُ قَلَمٍ");
        values.put("jwban", "0");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "كَمْ مِنَشَّةً فِيْ حُجْرَتِكَ؟");
        values.put("pil_a", "فِيْ الْمَسْجِدِ مِنَشَّتَانِ");
        values.put("pil_b", "فِيْ حُجْرَتِيْ مِنَشَّتَانِ");
        values.put("pil_c", "مِنَشَّتَانِ فِيْ الْبَيْتِ");
        values.put("jwban", "1");
        values.put("img", R.drawable.duakemoceng);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "أَيْنَ الْعَرَبَةُ؟");
        values.put("pil_a", "الْعَرَبَةُ فِي الشَّارِعِ");
        values.put("pil_b", "الْعَرَبَةُ فِي الرَّفِّ");
        values.put("pil_c", "الْعَرَبَةُ فِي الشَّجَرَةِ");
        values.put("jwban", "0");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "فِي الْمَنْزِلِ ... وَاحِدَةٌ,عَلَيْهَا ... اثْنَتَانِ");
        values.put("pil_a", "حَشِيَّةٌ وَ عُشْبَانِ");
        values.put("pil_b", "مِنْضَدَةٌ وَ صَحْنَانِ");
        values.put("pil_c", "سَبُّوْرَةٌ وَ طَلَّاسَتَانِ");
        values.put("jwban", "2");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "كَمْ مَدْرَسَةً فِي الْمَدِيْنَةِ؟");
        values.put("pil_a", "فِي الْمَدِيْنَةِ مَدَارِسُ كَثِيْرَةٌ");
        values.put("pil_b", "فِي الْمَدِيْنَةِ ثَلَاثَةُ مَدَارِسَ");
        values.put("pil_c", "فِي الْمَدِيْنَةِ مَدَارِسُ قَلِيْلٌ");
        values.put("jwban", "0");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "مَاذَا فِي الرَّفِّ؟");
        values.put("pil_a", "فِي الرَّفِّ حُقُوْلٌ");
        values.put("pil_b", "فِي الرَّفِّ صُحُوْنٌ");
        values.put("pil_c", "فِي الرَّفِّ قَنَاةٌ");
        values.put("jwban", "1");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "هَلِ السَّبُّوْرَةُ وَرَاءَ التِّلْمِيْذِ؟");
        values.put("pil_a", "لَا, لَيْسَتِ السَّبُّوْرَةُ وَرَاءَهُ بَلْ أَمَامَاهُ");
        values.put("pil_b", "لَا, لَيْسَ السَّبُّوْرَةُ وَرَاءَهُ بَلْ أَمَامَاهُ");
        values.put("pil_c", "لَا, لَسْتُ السَّبُّوْرَةَ وَرَاءَهُ بَلْ أَمَامَاهُ");
        values.put("jwban", "0");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "كَمْ رَكْعَةً صَلَاةُ الْمَغْرِبِ؟");
        values.put("pil_a", "صَلَاةُ الْمَغْرِبِ ثَلَاثَةُ رَكَعَاتٍ");
        values.put("pil_b", "صَلَاةُ الْمَغْرِبِ ثَلَاثُ رَكَعَاتٍ");
        values.put("pil_c", "صَلَاةُ الْمَغْرِبِ ثَلَاثُ رَكْعَةً");
        values.put("jwban", "1");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", ".... ؟عَلَيْهَا عِشْرُوْنَ وَلَدًا");
        values.put("pil_a", "كَمْ وَلَدًا عَلَى الْمِنْبَرِ؟");
        values.put("pil_b", "أَيْنَ عِشْرُوْنَ وَلَدًا؟");
        values.put("pil_c", "كَمْ وَلَدًا عَلَى أَرْبَعَةِ مَقَاعِدَ؟");
        values.put("jwban", "2");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "... ؟نَعَمْ, هُوَ لِأُمِّيْ");
        values.put("pil_a", "هَلِ السَّاعَةُ لِأُمِّيْ؟");
        values.put("pil_b", "هَلِ الأُمُّ لِجَرَّارٍ؟");
        values.put("pil_c", "هَلِ الْقَلَمُ لِأُمِّكِ؟");
        values.put("jwban", "2");
        values.put("img", R.drawable.tandatanya);
        db.insert("tbl_soal", "soal", values);
    }

    public List<Soal> getSoal() {
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()) {
            do {
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal.add(s);
            } while (cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);
    }
}
