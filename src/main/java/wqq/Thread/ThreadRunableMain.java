package wqq.Thread;

/**
 * 可见，实现Runnable接口相对于继承Thread类来说，有如下显著的优势：
 * （1）、 适合多个相同程序代码的线程去处理同一资源的情况，把虚拟CPU（线程）同程序的代码、数据有效分离，较好地体现了面向对象的设计思想。
 * （2）、 可以避免由于Java的单继承特性带来的局限。开发中经常碰到这样一种情况，即：当要将已经继承了某一个类的子类放入多线程中，由于一个类不能同时有两个父类，所以不能用继承Thread类的方式，那么就只能采用实现Runnable接口的方式了。
 * （3）、 增强了程序的健壮性，代码能够被多个线程共享，代码与数据是独立的。当多个线程的执行代码来自同一个类的实例时，即称它们共享相同的代码。多个线程可以操作相同的数据，与它们的代码无关。当共享访问相同的对象时，即共享相同的数据。当线程被构造时，需要的代码和数据通过一个对象作为构造函数实参传递进去，这个对象就是一个实现了Runnable接口的类的实例。
 *
 * 　　可以将一个Runnable接口的实例化对象作为参数去实例化Thread类对象。在实际的开发中，希望读者尽可能去使用Runnable接口去实现多线程机制。
 *
 *
 *
 */
public class ThreadRunableMain {
    public static void main(String[] args) {
        ThreadRunable threadRunable=new ThreadRunable();
        // 启动了四个线程，并实现了资源共享的目的
        //通过实现Runnable的方式启动四个进程，但是他们共同操纵同一对象，实现了资源的互斥共享。
        new Thread(threadRunable).start();
        new Thread(threadRunable).start();
        new Thread(threadRunable).start();
        new Thread(threadRunable).start();

    }
}
