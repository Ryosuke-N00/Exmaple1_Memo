enum class Tutorial{

    SATOU,
    SUZUKI,
    TANAKA

}

fun main(){

    for (myouji in Tutorial.values()){
        println(myouji)
    }

}


//引数を与えることもできる
enum class Example(val id : Int){
    Apple(1)
    Peach(2)
    Grape(3)
}

fun main(){
    for (fruits in Example.values()){
        println(${fruits.name} ${fruits.id})
    }
}


//定義したものにメソッドをオーバーライドして呼び出し

enum class Fanta{
    Fukuoka{override fun kyusyu(): String = "I like Fukuoka"}
    Kagoshima{override fun kyusyu(): String = "I will go there."}
    Okinawa{override fun kyusyu(): String = "I love Okinawa"}
}

fun main(){
    for (pref in Fanta.values()){
        println(pref.kyusyu())
    }
}






class MainActivity :AppCompatActivity(){

    //遅延しなかったら、nullでプロパティを初期化する必要がある
    private var textView: TextView?= null

    //viewの生成前は、初期化をすることができない→遅延効果をもたらす
    private lateinit var textView: TextView

    override fun onCreate(onSaveInstanceState: Bundle?){
        super.onCreate(onSaveInstanceState)

        //ここでビューの生成が完了するので、初期化を行う
        textView = findViewById(R.id.text_view)
    }


}



class Eleven{
    init{passBall()}

    val ball = true
    init{passBall()}


    fun passBall(){
        println(ball)
    }
}



}