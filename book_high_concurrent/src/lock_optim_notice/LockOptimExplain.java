package lock_optim_notice;

/**
 * 锁的优化-一般办法
 * @author mp
 * @date 2016-7-14 下午3:39:28
 */
public class LockOptimExplain {
	
	/**
	 * 对锁竞争越激烈,性能越低
	 * 一般就是减少没有必要的锁,跟减少有必要的锁持有时间
	 * 
	 * 1.减少锁的持有时间,有三个方法,有两个方法不用加锁,则只需给需要加锁的方法加锁,不要给三个方法都加锁
	 * 2.减少锁的粒度：比如concurrentHashMap内部分为16个段,put的时候,并不是对整个map加锁,而是看key在哪个段里,只对当前段加锁
	 * 3.读写分离锁的使用
	 * 4.锁分离：比如LinkedBlockingQueue,take方法和put方法,因为一个在头部,一个在尾部,互不影响,所以不需对真个对象加锁,分成take锁和put锁,两个方法之间不互斥
	 * 5.锁粗化：与减少锁的粒度相反,用在一个大循环,把锁放到循环外边比放到循环里边要好
	 */
	
}