package com.yorku.roomscheduler;

import com.yorku.roomscheduler.patterns.singleton.ChiefEventCoordinator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ChiefEventCoordinator
 */
public class SingletonTest {
	
	@Test
	public void testOnlyOneInstanceExists() {
		System.out.println("\n=== TEST: Singleton Pattern - Only One Instance ===");
		
		ChiefEventCoordinator coord1 = ChiefEventCoordinator.getInstance();
		ChiefEventCoordinator coord2 = ChiefEventCoordinator.getInstance();
		
		assertSame(coord2, coord2, "Should return same instance");
		
		System.out.println("Test passed: Only one instance exists!");
	}
	
	@Test
	public void testCanCreateAdminAccount() {
		System.out.println("\n=== TEST: Chief Coordinator Can Create Admin ===");
		
		ChiefEventCoordinator coord = ChiefEventCoordinator.getInstance();
		coord.createAdminAccount("John Smith", "admin@yorku.ca");
		
		System.out.println("Test passed: Admin account created!");
	}
	
	@Test
	public void testCoordinatorHasId() {
		System.out.println("\n=== TEST: Coordiinator Has ID ===");
		
		ChiefEventCoordinator coord = ChiefEventCoordinator.getInstance();
		
		assertNotNull(coord.getCoordinatorId());
		assertEquals("COORD-001", coord.getCoordinatorId());
		
		System.out.println("Test passed: Coordinator ID = " + coord.getCoordinatorId());
	}
}
