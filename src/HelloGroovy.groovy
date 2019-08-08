import java.time.temporal.Temporal

/*println("helloGroovy")*/

/*
    Groovy中的变量
    1.1、变量的类型：基本类型（java中的int,float,double,byte,char,long,short）
    和对象类型(String等) （Groovy中最终都是对象类型）
 */

/*int x = 10;
println(x.class)

double y = 3.14
println(y.class)*/

/*def x1 = 10
def y1 = 3.14
def str = 'groovy study'

println x1.class
println y1.class
println str.class*/


/*
def str = 'hello groovy'

def str1 = 'a single \'special\' string'
println str.class
println str1.class
*/


/*def trebleStr = '''line one
            line two
line three '''

def trebleStr2 = '''
line one
            line two
line three '''
def trebleStr3 = '''\
line one
            line two
line three '''

println('==================================================')
println(trebleStr)
println('==================================================')
println(trebleStr2)
println('==================================================')
println(trebleStr3)*/


/*def name = "Groovy"
def sayHello = "Hello $name"
println(sayHello)*/

//扩展内容还可以是表达式

/*def sum = "the sum of 2 and 3 equals ${2+3}"

print(sum)*/


// center(Number numberOfChars,CharSequence padding) ,将字符串作为中心进行填充
/*def str = "groovy"
println str.center(5,"a") //结果：groovy
println str.center(6,"a") //结果：groovy
println str.center(7,"a") //结果：groovya
println str.center(8,"a") //结果：agroovya
println str.center(9,"a") //结果：agroovyaa
println str.center(8)     //结果： groovy ，不传padding代表以空格填充*/

//PS:当numberOfChars小于或等于str本身的长度时，不进行填充操作，大于则用pandding扩展至长度numberOfChars，从字符串的右边（尾）进行填充，再到左边（头）

//padLeft(Number numberOfChars,CharSequence padding) ,在字符串的左边进行填充

//c. padRight(Number numberOfChars,CharSequence padding),在字符串的右边进行填充


/*
def str = "groovy"
println str.center(5,"a")
println str.center(6,"a")
println str.center(7,"a")
println str.center(8,"a")
println str.center(9,"a")*/

/*def str = "groovy"
def str2 = "Groovy"
println str.compareTo(str2)             //32   结果大于0，str大于Str2
println str.compareToIgnoreCase(str2)  //0   结果等于0，str等于忽略大小写的Str
println str2.compareTo(str)          //-32  结果小于0，str2小于str
println str > str2                  //true  可用操作符直接进行比较
println str == str2.toLowerCase()  //true*/


/*
def str = "groovy"
def str2 = "Groovy"
println str.compareTo(str2)
println str.compareToIgnoreCase(str2)
println str > str2
println(str == str2.toLowerCase())
*/
/*
def str = "groovy"
println str.getAt(0) //g
println str.getAt(0..1) //gr
println str[0] //g
println str[0..1] //gr*/

/*def str = "groovy"
println str.getAt(0)
println(str.getAt(0..1))
println(str[0])
println(str[0..1])*/

/*def str = "groovy"
def str2 = "hello"
def str3 = "hello groovy"
def str4 = "groovy hello "
*//*
println str.minus(str2) //groovy,   str中没有包含str2
println str.minus(str3) //groovy,   str中没有包含str3
println str3.minus(str2) // groovy, str3中包含了str2 (注意结果包含了空格)
println str3.minus(str4) //hello groovy str3z中没有包含str4
println str3 - str      //hello ,str3z中包含了str(注意结果包含了空格)*//*

println(str.minus(str2))
println(str.minus(str3))
println(str3.minus(str2))
println(str3.minus(str4))
println(str3 - str)*/

/*
def str = "hello groovy"
*/
/*println str.reverse() //yvoorg olleh,字符串反转
println str.capitalize()//Hello groovy,首字母大写
println str.isNumber() //false，是否全是数字*//*


def str2 = "1234"
*/
/*println str2.toInteger() //1234
println str2.toBigDecimal() // 1234
println str2.toDouble() //1234.0*//*

//等一系列转化类型方法

println(str.reverse())
println(str.capitalize())
println(str.isNumber())

println(str2.toInteger())
println(str2.toBigDecimal())
println(str2.toDouble())
*/

/*
//与java中一致
def name = "hello groovy"

String subHello(String str) {
    if (str.contains("hello")) {
        return str - "hello"
    } else {
        return str
    }
}
println subHello(name) // groovy(注意结果包含空格)
*/
/*

def name = "hello groovy"

String subHello(String str){
    if (str.contains("hello")){
        return str - "hello"
    }else {
        return str
    }
}

println( subHello(name))
*/


/*
//java中switch只能传入int类型、byte,char和short类型能自动提升为int类型、String类型和后来扩展的enum类型

//在groovy中，switch可以传入任性类型的数据进行匹配
String judgeType(Object x) {
    def result
    switch (x) {
        case "string":
            result = "x is string"
            break
        case [4, 5, 6, 7,'inList']: //列表（数据结构中讲解）
            result = "x is in list [4, 5, 6, 7,'inList']"
            break
        case 10..15: //范围range（数据结构中讲解）
            result = "x is in range 10..15"
            break
        case Integer:
            result = "x is Integer"
            break
        case BigDecimal:
            result = "x is BigDecimal"
            break
        case List:
            result = "x is List"
            break
        default:
            result = "no match"
            break
    }
    return result
}

def x = "string"
def x1 = 5
def x2 = 10
def x3 = 3
def x4 = 3.14
def x5 =[4,6]
def x6 ="hi groovy"
def x7 = "inList"
println judgeType(x) //x is string
println judgeType(x1) // x is in list [4, 5, 6, 7,'inList']
println judgeType(x2) // x is in range 10..15
println judgeType(x3) // x is Integer
println judgeType(x4) // x is BigDecimal
println judgeType(x5) // x is List
println judgeType(x6) // no match
println judgeType(x7) // x is in list [4, 5, 6, 7,'inList']
*/
/*

//与java中的while循环一致
def sum = 0
while(sum<10){
    println sum++
}
*/
/*

def sum = 0
while (sum < 10){
    println( sum ++)

}
*/
/*
 *范围中的for循环
 *//*

def sum = 0
for (i in 0..9) {
    sum += i
}
println sum //45

sum = 0
*/
/*
 *list中的for循环
 *//*

for (i in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]) {
    sum += i
}

println sum //45

*/
/*
 *map中的for循环
 *//*

for (i in ['java': 1, ' groovy': 2, 'python': 3]) {
    println "key:${i.key} value:${i.value}"
}
//key:java value:1
//key: groovy value:2
//key:python value:3

sum = 0
for ( i in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]){
    sum += 1
}
println(sum)

sum = 0
for (i in ['java':1,'groovy':2,'python':3]){
    println("key:${i.key} value:${i.value} ")
}*/


/*5.times {
    println("groovy")
}*/

/*
def name = 'd'
def result = name != 'd' ? 'c':'abc'
println(result)
*/
/*class Person {
}
*//*
Person person
println person?.Data?.name*//*
Person person
println(person?.Data?.name)*/

/*def g1 = '1'
def f1= g1 as int
def f2 = g1.asType(Integer)
println f2*/

/*
def g1 = '1'
def f1 = g1 as int
def f2 = g1.asType(Integer)
println(g1)
*/

/*
def map = [key1:"value1",key2:"value2",key3:"value3"]
*/
/*println map
println "map的长度:"+map.size()
println map.entrySet()
println map.keySet()
println map.values()
println map.key1
println map.get("key1")
map.put("key4","value4")
println map.entrySet()*//*

Iterator it = map.iterator()
while(it.hasNext()){
    println "遍历map:"+it.next()
}


println(map.containsValue("values1"))
map.clear()
*/

/*def range = 1..5
println range*/
/*println "长度:"+range.size()
println "迭代器:"+range.iterator()
println "获取标号为1的元素:" +range.get(1)
println "是否包含元素5:"+range.contains(5)
println "最后一个元素:"+range.last()*/
/*println "移除标号为1的元素:"+range.remove(1)
//清空列表
range.clear()*/
/*
println "第一个数据:"+range.from
println "最后一个数据:"+range.to
*/

/*
def xxx = {paramters -> code}
//或者
//def xxx = {无参数,纯code}

def fun1 = {
    p1 ->
        def s = "我是一个闭包,"+ p1
}
println(fun1.call())
println(fun1.call("我是一个参数"))
println fun1("我是参数2")

def fun2 = {
    it -> "abcd"
}
println fun2.call()

def fun3 = {
    -> "cccc"
}
println fun3.call()

def list = [1,2,3]
list.each {
    println it
}
*/

/*
def fun5(int a1,String b1,Closure closure){
    closure()
}
fun5(5,"test",{
    println "i am in closure"
})*/

/*task hello{
    doLast{
        println("hello world")
    }
}*/

//字符串与闭包的结合使用
//each
/*str2.each {
    String temp ->println temp
}*/

/*
str2.each {
    String str -> print str
}
*/


//find来查找符合条件的第一个
/*println str2.find{
    String s -> s.isNumber()
}*/

/*

println str2.find{
    String str -> str.isNumber()
}
*/
/*
//findAll
def sList = str2.findAll{
    String s1 -> s1.isNumber()
}
println sList
//any
def result = str2.any{
    String s -> s.isNumber()
}
println result
//collect
def list2 = str2.collect {
    it.toUpperCase()
}
println list2.toListString()
*/
/*
String str2 = 'the 2 and 4 is 6'

def sList = str2.findAll{
    String s -> s.isNumber()
}
println(sList)

def result = str2.any{
    String s -> s.isNumber()
}
println result


def list = str2.collect{
    String s -> s.toUpperCase()
}
println list.toString()
*/























