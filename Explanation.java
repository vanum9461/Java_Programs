public class Example{
    int x;  //instance var
    static int y;  //static member var

    public void fun(){    //instance member function
        static int a;  //wrong can't make static inside this
    }
    public static void fun2(){ 
        //can access only static member
    }//static function

    static class Test{

    }
}
//static var class me ek hi baar bnta hai.
//iska object se koi mtlb nhi hota.
//object kitne bhi ho,static 1 hoga.
//object.staticvar=5;