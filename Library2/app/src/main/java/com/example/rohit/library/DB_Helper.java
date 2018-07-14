package com.example.rohit.library;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static android.content.ContentValues.TAG;


public class DB_Helper extends SQLiteOpenHelper {
    public static String DB_PATH = "";
    public static String DB_NAME = "Library.db";
    private SQLiteDatabase mDataBase;
    private final Context mcontext;

    public DB_Helper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DB_NAME, null,1);
        this.mcontext = context;

    }
    private boolean checkDatabase(){
        File dbFile = new File(DB_PATH + DB_PATH);
        return dbFile.exists();
    }

    public boolean openDataBase(){
        String PATH = DB_PATH + DB_NAME;
        mDataBase= SQLiteDatabase.openDatabase(PATH,null,SQLiteDatabase.CREATE_IF_NECESSARY);
        return mDataBase != null;

    }

    private void copyDataBase()throws IOException
    {
        InputStream mInput=mcontext.getAssets().open(DB_NAME);
        String outFileName=DB_PATH + DB_NAME;
        OutputStream mOutput=new FileOutputStream(outFileName);
        byte[] mBuffer =new byte[1024];
        int mLength;
        while((mLength = mInput.read(mBuffer))>0)

        {
            mOutput.write(mBuffer,0,mLength);
        }
        mOutput.flush();
        mOutput.close();
        mInput.close();
    }
    public void createDataBase() throws IOException {
        boolean mDataBaseExist = checkDatabase();
        if (!mDataBaseExist) {
            this.getReadableDatabase();
            this.close();
            try {
                copyDataBase();
                Log.e(TAG, "createDatabase database created");
            } catch (IOException mIOException) {
                throw new Error("ErroeCoyingDatabase");
            }
        }
    }
    public synchronized void close() {
        if (mDataBase != null) {
            mDataBase.close();
            super.close();
        }
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}




