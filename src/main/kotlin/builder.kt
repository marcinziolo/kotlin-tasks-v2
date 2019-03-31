data class Building(val address: String, val floors: List<Floor>)
data class Floor(val name: String, val flats: List<Flat>)
data class Flat(val number: String, val area: Double, val balcoonArea: Double?)

fun main() {

    /* TODO Implement DSL
    building {
        address = "Krakowska 1, Krakow 20-341"
        floor {
            name = "Ground floor"
            flat {
                number = "1";
                area = 13.23
            }
            flat {
                number = "2";
                area = 17.23
            }
        }
        floor {
            name = "1st"
            flat {
                number = "3";
                area = 13.23;
                balcoonArea = 12.12
            }
        }
    }
    */
}
