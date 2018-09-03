package com.howshea.basemodule.extentions

import android.text.ParcelableSpan
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import com.howshea.basemodule.AppContext

/**
 * Created by haipo
 * on 2018/9/4.
 */
/**
 * 拼接不同颜色的字符串
 */
fun CharSequence.formatStringColor(color: Int, start: Int, end: Int): SpannableString {
    return this.setSpan(ForegroundColorSpan(AppContext.resources.getColor(color)), start, end)
}

private fun CharSequence.setSpan(span: ParcelableSpan, start: Int, end: Int): SpannableString {
    val spannableString = SpannableString(this)
    spannableString.setSpan(span, start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE)
    return spannableString
}
