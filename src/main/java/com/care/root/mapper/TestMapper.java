package com.care.root.mapper;

import java.util.ArrayList;

import com.care.root.tx.SystemDTO;
import com.care.root.tx.UserDTO;

public interface TestMapper {
	public int userInsert(int num);
	public int systemInsert(int num);
	public ArrayList<UserDTO> userDbResult();
	public ArrayList<SystemDTO> systemDbResult();
}
