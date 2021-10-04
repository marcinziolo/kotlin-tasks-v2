data class Building(val address: String, val floors: List<Floor>)
data class Floor(val name: String, val flats: List<Flat>)
data class Flat(val number: String, val area: Double, val balconyArea: Double?)

fun main() {

//   TODO implement DSL

//    val building = building {
//        address = "Mariacka 1, Krakow 20-341"
//        floor {
//            name = "ground floor"
//            flat {
//                number = "1";
//                area = 45.00
//            }
//            flat {
//                number = "2";
//                area = 50.00
//            }
//        }
//        floor {
//            name = "1st"
//            flat {
//                number = "3";
//                area = 45.00;
//                balconyArea = 12.50
//            }
//        }
//    }
//
//    println(building)

}
