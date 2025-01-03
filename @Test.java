@Test
public void testUserServiceSave() {
    User user = new User("John", "john@example.com");
    when(userRepository.save(user)).thenReturn(user);
    User savedUser = userService.save(user);
    assertEquals("John", savedUser.getName());
}
