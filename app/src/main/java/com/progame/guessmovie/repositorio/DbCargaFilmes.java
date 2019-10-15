package com.progame.guessmovie.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DbCargaFilmes {

    public SQLiteDatabase db;

    public DbCargaFilmes(DbHelper dbHelper){
        this.db = dbHelper.getWritableDatabase();
    }

    public void inserirFases(){
        ContentValues values = new ContentValues();
        long newRowId;

        values.put(PostFase.PostEntry.COLUMN_TITULO, "titanic");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OITEUISCTBDALPNMSHDEMSHSOB");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OHSFMPELUDB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***TITANIC****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 1);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "batman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OATEUISCRBDALNPMSHUE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "EHSFRPLCDGIOU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**BATMAN************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 2);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Lion King");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KTIZCVJXZMOVGLXEHINN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVMJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*THE*LION****KING***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 3);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Spider Man");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BZMKIENPHLAXSLXRDJVC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVBLLKJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "SPIDER*MAN**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 4);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Snow White");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "UIQELPQSNRWUJYOWTKPH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQRYUUPPLKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "SNOW*WHITE**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 5);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "thor");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OITEUISCXBDALBNMSHGR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "IEUSCXBDALNMG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***THOR*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 6);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "harry potter");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HIBLRIVAKBWORQYNBTRGEPNSTB");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "IBLVKWQNGS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****HARRY*******POTTER***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 7);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Black Panther");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HDGRBJVMNZPAIMFATSEZXCKLJG");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXVMMJJGGFDSI");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****BLACK*******PANTHER***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 8);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Brave");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LPQJTKEHDJBTOUWFVKWQYAGPRU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWTTYUUOPPLKKJJHGFD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****BRAVE*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 9);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Infinity War");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "INQQFKKINOPKJHLITYWUUARKGD");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQKKUUOPLKKJHGD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**INFINITY*******WAR*****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 10);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Martian");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZFJMJEBXRBGTZKVKLBNATAIHVC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXCBVVBBLKKJJGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*THE*MARTIAN**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 11);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Tropa de Elite");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WKJPLDQRKEITHQZEATQEYWOUSX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "YKJWQZKUQSHXW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**TROPA*DE******ELITE****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 12);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "maze runner");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RJFXLZENGXEHURMFPAND");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "XXFGHJLPFD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***MAZE*****RUNNER**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 13);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "alice");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BGVXTZIOWDQAHWSCDMKQLPNEGF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXDFGHOPMNBVTQWKSD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****ALICE*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 14);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Iron Man");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SIJCFSKGNMVJVLNDBRAO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "CVVBLKJJGFDSS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*IRON*MAN***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 15);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "cidade de deus");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DEXNAUECBEISJMGLVDWDQZDHNK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXVBNMLKJHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**CIDADE*DE******DEUS****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 16);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Cars");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SGVCXMKZZJBBAMNXLHKR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXVBBNMMLKKJHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***CARS*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 17);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Fifty Shades of Grey");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QSWUODAYEGFQIFPSKTEWRYFULH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWUUPLK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "FIFTY*SHADES***OF*GREY***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 18);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Twilight");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "TWILIGHTZZXXCVVBBMKJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBBMKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*TWILIGHT***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 19);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Man of Steel");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KGYFARDEEUSPLQPYGOWMJQTKNW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWRYYUPKKJGGPD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***MAN*OF*******STEEL****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 20);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Beautiful and the Beast");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FULAEASTEAUTEIDTHNBBQQWWZZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWZZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**BEAUTIFUL**AND*THE*BEAST");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 21);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "durkirk");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZJQHJIKNXDPOYMLCHWKVRJPBUL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXCVBMLJHPOLJYPHJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DUNKIRK****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 22);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "star trek");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ABTTESCYRWLVMKXNRZPU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "YUPLMNBVCXZW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***STAR******TREK***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 23);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Saw");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SZZXXWCVVBBNANMMLKJHHGFFDD");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBBNNMMLKJHHGFFDD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*****SAW******************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 24);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Mr and Mrs Smith");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DMRSSMTMRANIHQQWWEYYUOOPLK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWEYYUOOPLK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***MR*AND*****MRS*SMITH**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 25);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Unbreakable");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MFMAZGRNXEBLKFBVVJXCHEHUEZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVMMJHHGFFF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*UNBREAKEBLE**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 26);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "warcraft");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GOSLFTXYQZRMHWNKCRAA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QOZXLMNHGKYS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*WARCRAFT***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 27);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "deadpool");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BCWZEKXGQOIHDALVOPDJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXVCBIKHJG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*DEADPOOL***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 28);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "jumanji");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GIZTOPCRXJMANSJQYBWVULFDHT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXCVBLHGFDSPOYTR");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***JUMANJI****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 29);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Gravity");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "IJAFSLZGXDMKBZRBTVZXCMHNQY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCBBNMMLKJFDSQH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***GRAVITY****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 30);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Wonder");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ENKTOQIDWKQTJIYHPLYR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQTTYYIIPLKKJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**WONDER************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 31);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "john wick");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SKLRJLQTOPLUICGNDWYH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QLRTYUPLLGDS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***JOHN******WICK***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 32);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Ready Player One");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QGDQFHEYTLANOJRQJUFRYKAPEE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQTUKJJHGFF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "READY*PLAYER*****ONE*****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 33);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Interstellar");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XRZSVZBAREZXECZTNTVLLXIXCV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "INTERSTELLAR*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 34);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Inception");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QLGGNPQRIYKCNJEOXUWIYQKWHT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWRYYUXLKKJHGG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**INCEPTION***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 35);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Pirates of the Caribbean");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SHBIAAPEIBVOFERRENTXTAZXCZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*PIRATES*OF*THE*CARIBBEAN");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 36);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Godfather");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FTQPKUAPKIJTHYEDELOHWRGQPW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWYUIPPLKKJP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*****THE*******GODFATHER**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 37);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "frozen");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HFNLQPKEYWJYRMHKPOLZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWLYPPLKHMKHJY");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**FROZEN************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 38);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Hunger Games");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QPOTMNYIWJKRGUEGAEHHWSYEQP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWYYIOPPKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*THE*HUNGER*****GAMES****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 39);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Captain America");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "VZXFPCCKIBNXELIVAZAATJALMR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXFVVBLLKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***CAPTAIN******AMERICA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 40);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "percy jackson");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XCOHKPDFWUZGYCUNQLLVESJRAL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWULLHGFDZXVU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****PERCY*******JACKSON***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 41);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Greatest Showman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HWZVENRTXHABECSTGTEVAXSZOM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "THE*GREATEST***SHOWMAN***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 42);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "star wars");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MYAFZAPTVBLSWGZRQRSM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QYPVBMZGFLZM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***STAR******WARS***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 43);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "kingsman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NUPRGPLMNWAIUQKHDSFY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRYUPLPHFDU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*KINGSMAN***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 44);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Pacific Rim");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JAWYYQILHORIEICUMPLFWKOTQC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWETYYUOOLLKJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*PACIFIC*RIM**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 45);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Commuter");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CHBTJTZOVURLEKXMNMEZIPLKJL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXVBNLKJIPLKJKL");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "THE*COMMUTER*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 46);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "logan");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZTLWDYWGJRANHXQVFOQTVYZPKM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRTYPKJHFDZXZVMWQTY");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****LOGAN*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 47);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Inside Out");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "VIKSZJBVDTMNZEUXOLIC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXCVVBMLKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "INSIDE*OUT**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 48);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "I Robot");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QBOKWELKYPHGTQHOURJWDISPUF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWEYUUPPLKKJHHGFDS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***I*ROBOT****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 49);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Narnia");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MKCXABAKVBNNRVZLZXIM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBBMMLKK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**NARNIA************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 50);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Revenant");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "EQYHWTOYUTNEILRKENQVWAOJP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWYYUIOOPLKJP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*****THE*******REVENANT**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 51);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Guardians of the Galaxy");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DXLSABAUBRWNGAEHQGKTFOYIQA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWKBB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**GUARDIANS**OF*THE*GALAXY");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 52);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Hellboy");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MSGKBLNEZHFOLMDZXKXAAVFCYJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVNMMKKJGFFDSA");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***HELLBOY****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 53);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Glass");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KPTPFIEJYOTGLHQODRKSWQSUWA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWERTTYUIOOPPKJHKFD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****GLASS*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 54);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Little Mermaid");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "IELIDQWWZZXXTTTLEHMQERMAKK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWZZXXKK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*THE*LITTLE****MERMAID***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 55);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Troia");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ADFZGLYIJROFTSHKJUQPLWWYQE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWEYYUPLLKJJHGFFDSZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****TROIA*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 56);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Life of Pi");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZIOZFKELVJFXPXIBMNCB");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVBBNMKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "LIFE*OF*PI**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 57);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Sword in the Stone");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SOTOPNETQTNPHHKPKEWDRSQEIY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQPPYPKK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**THE*SWORD**IN*THE*STONE");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 58);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Fast and the Furious");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XHTSECNRFVTDEHFTUZAXOSAUZI");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "THE*FAST*AND*THE*FURIOUS*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 59);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Schindler's List");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "TCIWEQHGYWDNRPUZI'KSLSOLQS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWYUOPKXGZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*SCHINDLER'S*****LIST****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 60);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "How To Train your Dragon");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZQGYAXOIORODRTRXQNHZNWTAUO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXQQ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "HOW*TO*TRAIN*YOUR*DRAGON*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 61);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Hateful Eight");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WKETHIQLQFEKTPHTYYEWHGAUJJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWYYPKKJJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*THE*HATEFUL*****EIGHT****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 62);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Wreck In Ralph");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GFVDXPRMLZSKIABRXWXECNBZFH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXVBBMXXGFDFS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**WRECK*IN******RALPH****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 63);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Fight Club");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "UFRPHOBIQQYGLYTCWWJP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWRYYPOPJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "FIGHT*CLUB**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 64);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Aquaman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "APPPYMOIAZTZEQNWJAORKUKRLY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZWERRTYYPIOOPLKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***AQUAMAN****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 65);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Mulan");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZGKXJFCKUAVOGZMPXSNOBHLBDS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVBBKKJHGGFDSSPO");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****MULAN*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 66);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Dark Knight");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "INWDCJFVLMSXRHZZQQVKGTBOAK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXCVVBMLJFOSQQW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*DARK*KNIGHT**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 67);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Toy Story");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ULSFFKIQTUPHQJGHOYOEPRYIWT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWEUUIIPPLKJHHGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**TOY*STORY***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 68);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Ant Man");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NAQGNKXZJGWFADKBVVSHMTLCZX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBLKKJHGGFDSQW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***ANT*MAN****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 69);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Grown Ups");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "IRGSTAHXTUYXOAQLZQNDFJWKPK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQTTYILKKJHXXFDAAZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**GROWN*UPS**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 70);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}