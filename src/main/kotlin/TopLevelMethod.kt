import TopLevelMethod.Simple
import TopLevelMethod.topLevelMethods


fun main(args: Array<String>) {

    topLevelMethods() // metoda erişim için projeye doğrudan import edilir.

    val obj = Simple() //metoda erişim için Simple sınıfından bir nesne oluşturup kullanmak gerekir.
    print(obj.localMethod())

}