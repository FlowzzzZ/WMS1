package cn.hhu.ssm.common;

public class Code {
	public final static class RESPONSE_CODE {
		//没有查到数据
		public final static int COMMON_NO_DATA = 401;
		//数据已存在，不能再添加数据
		public final static int COMMON_EXISTED_DATA = 402;
		//数据不存在，不能删除
		public final static int COMMON_NON_EXISTED_DATA = 403;
		//缺少主键
		public final static int COMMON_NON_PRIMARY_KEY = 404;
		//log表更新错误，缺少主键
		public final static int LOG_NON_PRIMARY_KEY = 500;
		//log表缺乏更新信息
		public static final int LOG_NON_UPDATE_INFO = 501;
	}
}
