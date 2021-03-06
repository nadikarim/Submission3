package com.nadikarim.submission3.data.db

import android.net.Uri
import android.provider.BaseColumns
import com.nadikarim.submission3.utils.AUTHORITY
import com.nadikarim.submission3.utils.SCHEME

object DatabaseContract {



    class FavoriteColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "table_favorite"
            const val USERNAME = "username"
            const val NAME = "name"
            const val AVATAR = "avatar"
            const val COMPANY = "company"
            const val LOCATION = "location"
            const val REPOSITORY = "repository"
            const val FOLLOWER = "follower"
            const val FOLLOWING = "following"
            const val FAVORITE = "isFavorite"

            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
                    .authority(AUTHORITY)
                    .appendPath(TABLE_NAME)
                    .build()
        }
    }
}