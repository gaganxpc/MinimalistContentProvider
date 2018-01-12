package com.example.agan.minimalistcontentprovider;

import android.net.Uri;

/**
 * Created by Agan on 12/11/2017.
 */

public final class Contract {

    public Contract() {}
       // scheme://authority/path/id
       // content://com.android.example.wordcontentprovider.provider/words
       //static final String SINGLE_RECORD_MIME_TYPE = "vnd.android.cursor.item/vnd.com.example.provider.words";

    public static final String AUTHORITY = "com.android.example.minimalistcontentprovider.provider";

    public static final String CONTENT_PATH = "words";

    static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + CONTENT_PATH);

    static final int ALL_ITEMS = -2;
    static final String WORD_ID = "id";

    static final String SINGLE_RECORD_MIME_TYPE = "vnd.android.cursor.item/vnd.com.example.provider.words";
    static final String MULTIPLE_RECORDS_MIME_TYPE = "vnd.android.cursor.dir/vnd.com.example.provider.words";

}
