package rsphere4.com.mylibrary

import android.content.Context
import android.widget.Toast




class ToastMessage {

    fun create(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }


}