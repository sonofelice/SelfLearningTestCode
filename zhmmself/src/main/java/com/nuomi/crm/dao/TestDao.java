package com.nuomi.crm.dao;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.nuomi.crm.annotation.Mapper;
import com.nuomi.crm.model.MmTest;

@Mapper
public interface TestDao {

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@Select("select id, name, name_pinyin from mm_test; ")
	public List<MmTest> selectAll();
	
	
	
	/**
	 * 按照id查询记录
	 * @return
	 */
	@Select("select id,name,name_pinyin from mm_test where id=#{id}")
	public MmTest selectById(Long id);
	/**
	 *	插入数据，只包含id，name
	 * @param mmtTestS
	 */
	@Insert("insert into mm_test(id, name) values(#{id}, #{name})")  
    public void insertUser(MmTest mmtTestS);
	
}
