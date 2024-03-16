package com.eren.order.model

import androidx.annotation.StringRes

data class Food(val id: Int,
                @StringRes val foodName: Int,
                @StringRes val price: Int,)
