package Thread;

public class ThreadClass {
    // 1. Extend Thread and override run()
    public static class CrawlerThread extends Thread{
        private String url;
        public CrawlerThread(String url){
//        super("Crawler-Thread-" + url);// thread name! this.url = url;
            this.url = url;
        }
        @Override
        public void run() {// This code runs in a new thread! 🧵
            System.out.println(Thread.currentThread().getName() + " crawling: " + url);
            System.out.println(Thread.currentThread().getState());
        }
    }
    // 2. Create and start threads
    public static void main(String[] args){
         CrawlerThread t1 = new CrawlerThread("google.com");
         CrawlerThread t2 = new  CrawlerThread("github.com");

         t1.start();// ✅ Creates new thread → calls run() in it
         t2.start();// ✅ Another new thread // t1.run() ← ❌ WRONG! Runs in CURRENT thread. No new thread!
    }
}
