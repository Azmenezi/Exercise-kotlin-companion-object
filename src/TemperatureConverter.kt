data class TemperatureConverter(
    var temperatureInKelvin: Double,
    var temperatureInCelsius: Double,
    var temperatureInFahrenheit: Double
) {


    companion object {

        //this will assume it is a room or a weather temperature, accepts only Fahrenheit or Kelvin
        fun addTemperature(temperatureKelvinOrFahrenheit: Double): TemperatureConverter {
            var tempInKel: Double
            var tempInCel: Double
            var tempInFah: Double
            if (temperatureKelvinOrFahrenheit > 200) {
                tempInKel = temperatureKelvinOrFahrenheit
                tempInCel = fromKelvinToCelsius(tempInKel)
                tempInFah = fromCelsiusToFahrenheit(tempInCel)
            } else {
                tempInFah = temperatureKelvinOrFahrenheit
                tempInCel = fromFahrenheitToCelsius(tempInFah)
                tempInKel = fromCelsiusToKelvin(tempInCel)
            }
            return TemperatureConverter(tempInKel, tempInCel, tempInFah)
        }

        fun fromCelsiusToFahrenheit(temperature: Double): Double {
            return (temperature * 9 / 5 + 32)
        }

        fun fromKelvinToCelsius(temperature: Double): Double {
            return (temperature - 273.15)
        }

        fun fromCelsiusToKelvin(temperature: Double): Double {
            return (temperature + 273.15)
        }

        fun fromFahrenheitToCelsius(temperature: Double): Double {
            return ((temperature - 32) * 5 / 9)
        }
    }
}