package single_hunger;



public class Single {
	
	/**
	 * 私有构造方法
	 */
	private Single () {
		
	}
	
	/**
	 * 私有静态实例
	 */
	private static Single single = new Single();
	
	/**
	 * 获取实例
	 * @author mp
	 * @date 2016-5-25 下午2:08:02
	 * @return
	 * @Description
	 */
	public static Single getInstance () {
		return single;
	}
	
}
