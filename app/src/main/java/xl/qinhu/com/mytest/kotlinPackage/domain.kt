package xl.qinhu.com.mytest.kotlinPackage

/**
 * Created by xl100 on 2018/5/9.
 */
class domain {
    data class ForecastList(val city: String, val country: String,
                            val dailyForecast:List<Forecast>)
    data class Forecast(val date: String, val description: String, val high: Int, val low: Int)
}