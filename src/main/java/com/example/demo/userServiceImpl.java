package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.bean.UserAddressVO;
import com.atguigu.user.IUserService;

@Service
@Component
public class userServiceImpl implements IUserService{

	@Override
	public List<UserAddressVO> getUserAddressByUserId(Integer userId) {
		List<UserAddressVO> list = new ArrayList<UserAddressVO>();
		UserAddressVO u1 = new UserAddressVO(1, "张三", "13611112221", "杭州滨江区");
		UserAddressVO u2 = new UserAddressVO(2, "李四", "13611112222", "杭州萧山区");
		UserAddressVO u3 = new UserAddressVO(3, "王二", "13611112223", "杭州西湖区");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}

}
