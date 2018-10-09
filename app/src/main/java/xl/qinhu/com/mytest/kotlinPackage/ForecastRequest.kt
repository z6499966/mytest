package xl.qinhu.com.mytest.kotlinPackage

import com.google.gson.Gson
import xl.qinhu.com.mytest.util.LogUtil
import java.net.URL

/**
 * Created by xl100 on 2018/5/9.
 */
public class ForecastRequest(val zipCode: String) {
    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/" +
                "forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        LogUtil.e(forecastJsonStr)
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}