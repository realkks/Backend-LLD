package DesignPatterns.SingletonClassDP;

public class  DbConnection {

    // Sol:
//    DbConnection(){         // Creating constructor
//
//    }
    //Sol:1
    private DbConnection(){
    }
//
    public static DbConnection getInstance (){

        return new DbConnection();
    }

    // Sol:2
//    private static DbConnection DbConInstance = null;
//    public static DbConnection getInstance (){
//        if(DbConInstance==null){
//            DbConInstance = new DbConnection();
//        }
//        return new DbConnection();
//    }

    // Sol:3
//        private static DbConnection DbConInstance = new DbConnection();
//    public static DbConnection getInstance (){
//        if(DbConInstance==null){
//            lock();
//            DbConInstance = new DbConnection();
//            unlock();
//        }
//        return new DbConnection();
//    }


    // Sol:4
//        private static DbConnection DbConInstance = null;
//    public static DbConnection getInstance (){
//        if(DbConInstance==null){
//            lock();
//            DbConInstance = new DbConnection();
//            unlock();
//        }
//        return new DbConnection();
//    }


    // Sol:4
//        private static DbConnection DbConInstance = null;
//    public static DbConnection getInstance (){
//        if(DbConInstance==null){
//            lock();
//            DbConInstance = new DbConnection();
//            unlock();
//        }
//        return new DbConnection();
//    }

    // Sol:5
//        private static DbConnection DbConInstance = null;
//   public static DbConnection getInstance (){
//        if(DbConInstance==null){
////            lock();
//                if(DbConInstance==null) {
//                    DbConInstance = new DbConnection();
//                }
////            unlock();
//        }
//        return new DbConnection();
//    }
}
