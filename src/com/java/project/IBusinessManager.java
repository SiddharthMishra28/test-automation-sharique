package com.java.project;

import java.util.Map;

public interface IBusinessManager {
	
	/**
	 * <p>Creates a new Business as per model definitions</p>
	 * @version 1.0
	 * @author Siddharth
	 */
	public Business createBusiness();
	
	/**
	 * <p>Updates an existing Business</p>
	 * @version 1.0
	 * @author Siddharth
	 */
	public Business updateBusiness(int id, Business business);
	
	/**
	 * <p>Reads Business details</p>
	 * @version 1.0
	 * @author Siddharth
	 */
	public Business readBusiness(int id);
	
	/**
	 * <p>Delete business</p>
	 * @version 1.0
	 * @author Siddharth
	 */
	public boolean deleteBusiness(int id);
	
	public Map<String, Integer> geographicalDistribution();
}
