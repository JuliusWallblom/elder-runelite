package io;

import java.awt.event.KeyEvent;
import java.io.File;

import io.cache.Cache;
import io.cache.Revision;

public class LoginScreen {

	public static boolean remember_username;
	public static boolean hide_username;
	public static boolean hovering_remember_username;
	public static boolean hovering_hide_username;
	public static boolean disable_music;

	public static final int USERNAME_CAPACITY = 16;
	public static final int PASSWORD_CAPACITY = 20;

	public static int login_screen_state = 0;

	public static String login_message_0 = "";
	public static String login_message_1 = "";
	public static String login_message_2 = "";

	public static String username = "";
	public static String password = "";
	public static String remembered_username = "";

	public static int editing = 0;

	public static int login_state;

	public static AbstractSprite login_box_image;
	public static AbstractSprite login_button_image;
	public static AbstractSprite unchecked_checkbox_image;
	public static AbstractSprite unchecked_checkbox_hover_image;
	public static AbstractSprite checked_checkbox_image;
	public static AbstractSprite checked_checkbox_hover_image;
	public static AbstractSprite world_selection_button_image;
	public static AbstractSprite music_enabled_image;
	public static AbstractSprite music_disabled_image;

	public static final String REGISTER_URL = "https://google.com";
	public static final String RECOVER_URL = "https://google.com";
	public static final String SUPPORT_URL = "https://google.com";

	public static void unpack() {
		LoginScreen.login_box_image = Client.sprite_loader.ld_to_abstract_sprite(LDSprite
				.method130(Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "sprites"), (SpriteConstants.LOGIN_BOX)), true);
		LoginScreen.login_button_image = Client.sprite_loader.ld_to_abstract_sprite(LDSprite.method130(
				Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "sprites"), (SpriteConstants.LOGIN_BUTTON)), true);

		LoginScreen.unchecked_checkbox_image = Client.sprite_loader.ld_to_abstract_sprite(LDSprite.method130(
				Cache.get_index(Revision.OSRS, "sprites"), (SpriteConstants.UNCHECKED_CHECKBOX_IMAGE)), true);
		LoginScreen.unchecked_checkbox_hover_image = Client.sprite_loader.ld_to_abstract_sprite(LDSprite.method130(
				Cache.get_index(Revision.OSRS, "sprites"), (SpriteConstants.UNCHECKED_CHECKBOX_HOVER_IMAGE)), true);
		LoginScreen.checked_checkbox_image = Client.sprite_loader.ld_to_abstract_sprite(
				LDSprite.method130(Cache.get_index(Revision.OSRS, "sprites"), (SpriteConstants.CHECKED_CHECKBOX_IMAGE)),
				true);
		LoginScreen.checked_checkbox_hover_image = Client.sprite_loader.ld_to_abstract_sprite(LDSprite.method130(
				Cache.get_index(Revision.OSRS, "sprites"), (SpriteConstants.CHECKED_CHECKBOX_HOVER_IMAGE)), true);

		LoginScreen.world_selection_button_image = Client.sprite_loader.ld_to_abstract_sprite(
				LDSprite.method130(Cache.get_index(Revision.OSRS, "sprites"), (SpriteConstants.WORLD_SELECT_IMAGE)),
				true);
		LoginScreen.music_enabled_image = Client.sprite_loader.ld_to_abstract_sprite(LDSprite
				.method129(Cache.get_index(Revision.OSRS, "sprites"), (SpriteConstants.MUSIC_GROUP_IMAGE), 0)[0], true);
		LoginScreen.music_disabled_image = Client.sprite_loader.ld_to_abstract_sprite(LDSprite
				.method129(Cache.get_index(Revision.OSRS, "sprites"), (SpriteConstants.MUSIC_GROUP_IMAGE), 0)[1], true);
	}

	public static void destroy() {
		unchecked_checkbox_image = null;
		unchecked_checkbox_hover_image = null;
		checked_checkbox_image = null;
		checked_checkbox_hover_image = null;
		login_box_image = null;
		login_button_image = null;
		world_selection_button_image = null;
		music_enabled_image = null;
		music_disabled_image = null;
	}

	enum LoginScreenButtons {
		NEW_ACCOUNT(new Boundary(229, 375, 271, 315), -2, 0), EXISTING_ACCOUNT(new Boundary(389, 535, 271, 315), 1, 0),
		CANCEL(new Boundary(389, 535, 301, 315 + 30), 0, 1), LOGIN(new Boundary(229, 375, 301, 315 + 30), -1, 1),
		REMEMBER_USERNAME(new Boundary(265, 282, 277, 294), -3, 1),
		HIDE_USERNAME(new Boundary(406, 423, 277, 294), -4, 1),

		USERNAME_INPUT(new Boundary(312, 412, 253 - 8, 263 - 8), -7, 1),
		RECOVERY_USERNAME_INPUT(new Boundary(312, 412, 253 - 8, 263 - 8), -7, 1),
		PASSWORD_INPUT(new Boundary(345, 445, 268 - 8, 278 - 8), -8, 1),

		WORLD_SELECT(new Boundary(5, 105, 463, 498), -5, 1), MUSIC_TOGGLE(new Boundary(725, 762, 463, 498), -6, 1),
		UNABLE_TO_LOGIN(new Boundary(322, 482, 349, 359), -9, 1),
		STILL_UNABLE_TO_LOGIN(new Boundary(322, 482, 349, 359), -10, -9),
		BACK_FROM_RECOVERY(new Boundary(389, 585, 301, 315 + 30), 1, -9),
		RECOVER(new Boundary(229, 375, 301, 315 + 30), -11, -9), BACK(new Boundary(309, 455, 301, 315 + 30), 1, -11),
		FORGOTTEN_PASSWORD(new Boundary(309, 455, 306, 321 + 30), -9, 90),
		TRY_AGAIN(new Boundary(309, 455, 256, 256 + 41), 0, 90),
		SUPPORT_PAGE(new Boundary(309, 455, 256, 256 + 41), -14, 91),
		BACK_FROM_DISABLED_ACCOUNT(new Boundary(309, 455, 306, 321 + 30), 0, 91);

		private Boundary boundary;
		private int login_screen_state;
		private int visible_in_login_screen_state;

		public Boundary get_boundary() {
			return this.boundary;
		}

		public int get_login_screen_state() {
			return this.login_screen_state;
		}

		public int get_visible_in_login_screen_state() {
			return this.visible_in_login_screen_state;
		}

		LoginScreenButtons(final Boundary boundary, final int login_screen_state,
				final int visible_in_login_screen_state) {
			this.boundary = boundary;
			this.login_screen_state = login_screen_state;
			this.visible_in_login_screen_state = visible_in_login_screen_state;
		}
	}

	public static boolean allow_key_input(char character) {
		String input = String.valueOf(character);
		return (Character.isDigit(character) || Character.isLetter(character) || input.equals("!") || input.equals("\"")
				|| input.equals("#") || input.equals("%") || input.equals("&") || input.equals("/") || input.equals("(")
				|| input.equals(")") || input.equals("=") || input.equals("?") || input.equals(">") || input.equals("^")
				|| input.equals("*") || input.equals(",") || input.equals(".") || input.equals("-") || input.equals(";")
				|| input.equals(":") || input.equals("_"));
	}

	public static void handle_key_input(KeyEvent key_event) {
		if (key_event.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if (editing == 0) {
				if (username.length() > 0) {
					username = username.substring(0, username.length() - 1);
				}
			} else if (editing == 1) {
				if (password.length() > 0) {
					password = password.substring(0, password.length() - 1);
				}
			}
		} else if (key_event.getKeyCode() == KeyEvent.VK_ENTER) {
			if (login_screen_state == LoginScreenButtons.EXISTING_ACCOUNT.get_login_screen_state()) {
				if (editing == 0) {
					editing = 1;
				} else {
					if (username.length() == 0) {
						editing = 0;
						login_message_0 = "";
						login_message_1 = "Please enter your username/email address.";
						login_message_2 = "";
					} else if (password.length() == 0) {
						editing = 1;
						login_message_0 = "";
						login_message_1 = "Please enter your password.";
						login_message_2 = "";
					} else {
						login_screen_state = LoginScreenButtons.LOGIN.get_login_screen_state();
					}
				}
			} else {
				login_message_0 = "";
				login_message_1 = "Enter your username/email & password.";
				login_message_2 = "";
				username = remember_username ? remembered_username : "";
				editing = username.length() > 0 ? 1 : 0;
				password = "";
				login_screen_state = LoginScreenButtons.EXISTING_ACCOUNT.get_login_screen_state();
			}
		} else if (key_event.getKeyCode() == KeyEvent.VK_TAB) {
			if (editing == 0) {
				editing = 1;
			} else {
				editing = 0;
			}
		} else if (key_event.getKeyCode() != KeyEvent.VK_SHIFT && key_event.getKeyCode() != KeyEvent.VK_CONTROL
				&& key_event.getKeyCode() != KeyEvent.VK_ALT) {
			String val = String.valueOf(key_event.getKeyChar());
			if (allow_key_input(key_event.getKeyChar())) {
				if (editing == 0) {
					if (username.length() < USERNAME_CAPACITY) {
						username = username + val;
					}
				} else if (editing == 1) {
					if (password.length() < PASSWORD_CAPACITY) {
						password = password + val;
					}
				}
			}
		}
		draw_current_state();
	}

	public static void draw() {
		TitleScreen.draw_background();
		TitleScreen.draw_logo();
		draw_current_state();
	}

	public static void update_hovers() {
		if (login_screen_state == LoginScreenButtons.EXISTING_ACCOUNT.get_login_screen_state()) {
			(remember_username
					? hovering_remember_username ? LoginScreen.checked_checkbox_hover_image
							: LoginScreen.checked_checkbox_image
					: hovering_remember_username ? LoginScreen.unchecked_checkbox_hover_image
							: LoginScreen.unchecked_checkbox_image)
					.draw_sprite(
							LoginScreenButtons.REMEMBER_USERNAME.get_boundary().get_start_x(),
							LoginScreenButtons.REMEMBER_USERNAME.get_boundary().get_start_y());
			(hide_username
					? hovering_hide_username ? LoginScreen.checked_checkbox_hover_image
							: LoginScreen.checked_checkbox_image
					: hovering_hide_username ? LoginScreen.unchecked_checkbox_hover_image
							: LoginScreen.unchecked_checkbox_image)
					.draw_sprite(
							LoginScreenButtons.HIDE_USERNAME.get_boundary().get_start_x(),
							LoginScreenButtons.HIDE_USERNAME.get_boundary().get_start_y());
		}
	}

	public static void draw_current_state() {
		if (login_screen_state == LoginScreenButtons.LOGIN.get_login_screen_state()) {
			LoginScreen.login_box_image.draw_sprite(Client.client_width / 2 - LoginScreen.login_box_image.j() / 2, 171);
			FontCache.bold_font.draw_centered_text("<col=ffff00>Connecting to server...", 382, 216, -16777216);
			FontCache.bold_font.draw_text("<col=ffffff>Login:", 272, 253, -16777216);
			FontCache.bold_font.draw_text("<col=ffffff>" + (hide_username ? username.replaceAll(".", "*") : username),
					LoginScreenButtons.USERNAME_INPUT.get_boundary().get_start_x(),
					LoginScreenButtons.USERNAME_INPUT.get_boundary().get_start_y() + 8, -16777216);
			FontCache.bold_font.draw_text("<col=ffffff>Password:", 274, 268, -16777216);
			FontCache.bold_font.draw_text("<col=ffffff>" + password.replaceAll(".", "*"),
					LoginScreenButtons.PASSWORD_INPUT.get_boundary().get_start_x(),
					LoginScreenButtons.PASSWORD_INPUT.get_boundary().get_start_y() + 8, -16777216);
			if (remember_username) {
				remembered_username = username;
			}
			Client.current_renderer.save_preferences(Client.sign_link);
			LoginScreen.request_login(username, password, 0);
		} else if (login_screen_state == LoginScreenButtons.EXISTING_ACCOUNT.get_login_screen_state()) {
			LoginScreen.login_box_image.draw_sprite(Client.client_width / 2 - LoginScreen.login_box_image.j() / 2, 171);
			FontCache.bold_font.draw_centered_text("<col=ffff00>" + login_message_0, 382, 201, -16777216);
			FontCache.bold_font.draw_centered_text("<col=ffff00>" + login_message_1, 382, 216, -16777216);
			FontCache.bold_font.draw_centered_text("<col=ffff00>" + login_message_2, 382, 231, -16777216);
			LoginScreen.login_button_image.draw_sprite(LoginScreenButtons.LOGIN.get_boundary().get_start_x(),
					LoginScreenButtons.LOGIN.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>Login", 302, 326, -16777216);
			LoginScreen.login_button_image.draw_sprite(LoginScreenButtons.CANCEL.get_boundary().get_start_x(),
					LoginScreenButtons.CANCEL.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>Cancel", 462, 326, -16777216);
			FontCache.bold_font.draw_text("<col=ffffff>Login:", 272, 253, -16777216);
			FontCache.bold_font.draw_text(
					"<col=ffffff>" + (hide_username ? username.replaceAll(".", "*") : username)
							+ (editing == 0 && Client.cycle % 50 < 25 ? "<col=ffff00>|" : ""),
					LoginScreenButtons.USERNAME_INPUT.get_boundary().get_start_x(),
					LoginScreenButtons.USERNAME_INPUT.get_boundary().get_start_y() + 8, -16777216);
			FontCache.bold_font.draw_text("<col=ffffff>Password:", 274, 268, -16777216);
			FontCache.bold_font.draw_text(
					"<col=ffffff>" + password.replaceAll(".", "*")
							+ (editing == 1 && Client.cycle % 50 < 25 ? "<col=ffff00>|" : ""),
					LoginScreenButtons.PASSWORD_INPUT.get_boundary().get_start_x(),
					LoginScreenButtons.PASSWORD_INPUT.get_boundary().get_start_y() + 8, -16777216);
			(remember_username
					? hovering_remember_username ? LoginScreen.checked_checkbox_hover_image
							: LoginScreen.checked_checkbox_image
					: hovering_remember_username ? LoginScreen.unchecked_checkbox_hover_image
							: LoginScreen.unchecked_checkbox_image)
					.draw_sprite(
							LoginScreenButtons.REMEMBER_USERNAME.get_boundary().get_start_x(),
							LoginScreenButtons.REMEMBER_USERNAME.get_boundary().get_start_y());
			FontCache.small_font.draw_text("<col=ffff00>Remember username", 285, 290, -16777216);
			(hide_username
					? hovering_hide_username ? LoginScreen.checked_checkbox_hover_image
							: LoginScreen.checked_checkbox_image
					: hovering_hide_username ? LoginScreen.unchecked_checkbox_hover_image
							: LoginScreen.unchecked_checkbox_image)
					.draw_sprite(
							LoginScreenButtons.HIDE_USERNAME.get_boundary().get_start_x(),
							LoginScreenButtons.HIDE_USERNAME.get_boundary().get_start_y());
			FontCache.small_font.draw_text("<col=ffff00>Hide username", 426, 290, -16777216);
			FontCache.small_font.draw_centered_text("<col=ffffff>Can't login? Click here.",
					LoginScreenButtons.UNABLE_TO_LOGIN.get_boundary().get_start_x() + 60,
					LoginScreenButtons.UNABLE_TO_LOGIN.get_boundary().get_start_y() + 8, -16777216);
		} else if (login_screen_state == LoginScreenButtons.UNABLE_TO_LOGIN.get_login_screen_state()) {
			LoginScreen.login_box_image.draw_sprite(Client.client_width / 2 - LoginScreen.login_box_image.j() / 2, 171);
			FontCache.bold_font.draw_centered_text("<col=ffff00>Forgotten your password?", 382, 201, -16777216);
			FontCache.regular_font.draw_centered_text("<col=ffff00>Please enter your username.", 382, 221, -16777216);
			FontCache.regular_font.draw_centered_text("<col=ffff00>If you created your account after November", 382,
					236, -16777216);
			FontCache.regular_font.draw_centered_text("<col=ffff00>2010, this will be the creation email address.", 382,
					251, -16777216);
			LoginScreen.login_button_image.draw_sprite(LoginScreenButtons.RECOVER.get_boundary().get_start_x(),
					LoginScreenButtons.RECOVER.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>Recover", 302, 326, -16777216);
			LoginScreen.login_button_image.draw_sprite(
					LoginScreenButtons.BACK_FROM_RECOVERY.get_boundary().get_start_x(),
					LoginScreenButtons.BACK_FROM_RECOVERY.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>Back", 462, 326, -16777216);
			FontCache.bold_font.draw_text("<col=ffffff>Username/email:", 237, 280, -16777216);
			LoginScreenButtons.RECOVERY_USERNAME_INPUT.boundary = new Boundary(348, 462, 280 - 8, 263 - 8);
			FontCache.bold_font.draw_text(
					"<col=ffffff>" + (hide_username ? username.replaceAll(".", "*") : username)
							+ (editing == 0 && Client.cycle % 50 < 25 ? "<col=ffff00>|" : ""),
					LoginScreenButtons.RECOVERY_USERNAME_INPUT.get_boundary().get_start_x(),
					LoginScreenButtons.RECOVERY_USERNAME_INPUT.get_boundary().get_start_y() + 8, -16777216);
			FontCache.small_font.draw_centered_text("<col=ffffff>Still having trouble logging in?",
					LoginScreenButtons.STILL_UNABLE_TO_LOGIN.get_boundary().get_start_x() + 60,
					LoginScreenButtons.STILL_UNABLE_TO_LOGIN.get_boundary().get_start_y() + 8, -16777216);
		} else if (login_screen_state == LoginScreenButtons.RECOVER.get_login_screen_state()) {
			LoginScreen.login_box_image.draw_sprite(Client.client_width / 2 - LoginScreen.login_box_image.j() / 2, 171);
			FontCache.bold_font.draw_centered_text("<col=ffff00>Page has opened in a new window.", 382, 201 + 15,
					-16777216);
			FontCache.bold_font.draw_centered_text("<col=ffff00>(Please check your popup blocker.)", 382, 216 + 15,
					-16777216);
			LoginScreen.login_button_image.draw_sprite(LoginScreenButtons.BACK.get_boundary().get_start_x(),
					LoginScreenButtons.BACK.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>Back", 302 + 80, 326, -16777216);
		} else if (login_screen_state == 90) { // invalid credentials
			LoginScreen.login_box_image.draw_sprite(Client.client_width / 2 - LoginScreen.login_box_image.j() / 2, 171);
			FontCache.bold_font.draw_centered_text("<col=ffff00>Invalid credentials.", 382, 201, -16777216);
			FontCache.small_font.draw_centered_text(
					"<col=ffff00>For accounts created after 24th November 2010, please use your", 382, 221, -16777216);
			FontCache.small_font.draw_centered_text(
					"<col=ffff00>email address to login. Otherwise please login with your username.", 382, 236,
					-16777216);
			LoginScreen.login_button_image.draw_sprite(LoginScreenButtons.TRY_AGAIN.get_boundary().get_start_x(),
					LoginScreenButtons.TRY_AGAIN.get_boundary().get_start_y());
			FontCache.regular_font.draw_centered_text("<col=ffffff>Try again", 302 + 80, 281, -16777216);
			LoginScreen.login_button_image.draw_sprite(
					LoginScreenButtons.FORGOTTEN_PASSWORD.get_boundary().get_start_x(),
					LoginScreenButtons.FORGOTTEN_PASSWORD.get_boundary().get_start_y());
			FontCache.regular_font.draw_centered_text("<col=ffffff>Forgotten password?", 302 + 80, 331, -16777216);
		} else if (login_screen_state == 91) { // banned
			LoginScreen.login_box_image.draw_sprite(Client.client_width / 2 - LoginScreen.login_box_image.j() / 2, 171);
			FontCache.bold_font.draw_centered_text("<col=ffff00>Your account has been disabled.", 382, 201, -16777216);
			FontCache.regular_font.draw_centered_text("<col=ffff00>Please visit the support page for assistance.", 382,
					216, -16777216);
			LoginScreen.login_button_image.draw_sprite(LoginScreenButtons.SUPPORT_PAGE.get_boundary().get_start_x(),
					LoginScreenButtons.SUPPORT_PAGE.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>Support Page", 302 + 80, 281, -16777216);
			LoginScreen.login_button_image.draw_sprite(
					LoginScreenButtons.BACK_FROM_DISABLED_ACCOUNT.get_boundary().get_start_x(),
					LoginScreenButtons.BACK_FROM_DISABLED_ACCOUNT.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>Back", 302 + 80, 331, -16777216);
		} else {
			LoginScreen.login_box_image.draw_sprite(Client.client_width / 2 - LoginScreen.login_box_image.j() / 2, 171);
			FontCache.bold_font.draw_centered_text("<col=ffff00>Welcome to " + GameConstants.NAME, 383, 251, -16777216);
			LoginScreen.login_button_image.draw_sprite(LoginScreenButtons.NEW_ACCOUNT.get_boundary().get_start_x(),
					LoginScreenButtons.NEW_ACCOUNT.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>New User", 300, 295, -16777216);
			LoginScreen.login_button_image.draw_sprite(LoginScreenButtons.EXISTING_ACCOUNT.get_boundary().get_start_x(),
					LoginScreenButtons.EXISTING_ACCOUNT.get_boundary().get_start_y());
			FontCache.bold_font.draw_centered_text("<col=ffffff>Existing User", 461, 295, -16777216);
		}
		(disable_music ? LoginScreen.music_disabled_image : LoginScreen.music_enabled_image).draw_sprite(
				LoginScreenButtons.MUSIC_TOGGLE.get_boundary().get_start_x(),
				LoginScreenButtons.MUSIC_TOGGLE.get_boundary().get_start_y());
	}

	static void handle_hovers(final int mouse_x, final int mouse_y) {
		hovering_remember_username = false;
		hovering_hide_username = false;
		for (LoginScreenButtons hovered_element : LoginScreenButtons.values()) {
			if (login_screen_state == hovered_element.get_visible_in_login_screen_state()
					&& mouse_x >= hovered_element.get_boundary().get_start_x()
					&& mouse_x <= hovered_element.get_boundary().get_end_x()
					&& mouse_y >= hovered_element.get_boundary().get_start_y()
					&& mouse_y <= hovered_element.get_boundary().get_end_y()) {
				if (hovered_element.get_login_screen_state() == LoginScreenButtons.REMEMBER_USERNAME
						.get_login_screen_state()) {
					hovering_remember_username = true;
				} else if (hovered_element.get_login_screen_state() == LoginScreenButtons.HIDE_USERNAME
						.get_login_screen_state()) {
					hovering_hide_username = true;
				}
			}
		}
	}

	static void handle_click_input(final int mouse_x, final int mouse_y) {
		for (LoginScreenButtons button : LoginScreenButtons.values()) {
			if ((button == LoginScreenButtons.MUSIC_TOGGLE || button == LoginScreenButtons.WORLD_SELECT
					|| login_screen_state == button.get_visible_in_login_screen_state())
					&& mouse_x >= button.get_boundary().get_start_x() && mouse_x <= button.get_boundary().get_end_x()
					&& mouse_y >= button.get_boundary().get_start_y() && mouse_y <= button.get_boundary().get_end_y()) {
				if (button.get_login_screen_state() == LoginScreenButtons.LOGIN.get_login_screen_state()) {
					if (username.length() == 0) {
						editing = 0;
						login_message_0 = "";
						login_message_1 = "Please enter your username/email address.";
						login_message_2 = "";
					} else if (password.length() == 0) {
						editing = 1;
						login_message_0 = "";
						login_message_1 = "Please enter your password.";
						login_message_2 = "";
					} else {
						login_screen_state = LoginScreenButtons.LOGIN.get_login_screen_state();
					}
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.SUPPORT_PAGE.get_login_screen_state()) {
					Client.open_url(SUPPORT_URL);
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.RECOVER.get_login_screen_state()) {
					Client.open_url(RECOVER_URL + File.separator + username);
				}
				if (button.get_login_screen_state() == LoginScreenButtons.UNABLE_TO_LOGIN.get_login_screen_state()) {
					editing = 0;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.STILL_UNABLE_TO_LOGIN
						.get_login_screen_state()) {
					Client.open_url(RECOVER_URL + File.separator + username);
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.MUSIC_TOGGLE.get_login_screen_state()) {
					System.out.println("music");
					disable_music = !disable_music;
					Client.current_renderer.save_preferences(Client.sign_link);
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.WORLD_SELECT.get_login_screen_state()) {
					// TODO world select
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.USERNAME_INPUT.get_login_screen_state()) {
					editing = 0;
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.PASSWORD_INPUT.get_login_screen_state()) {
					editing = 1;
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.NEW_ACCOUNT.get_login_screen_state()) {
					Client.open_url(REGISTER_URL);
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.REMEMBER_USERNAME.get_login_screen_state()) {
					remember_username = !remember_username;
					Client.current_renderer.save_preferences(Client.sign_link);
					hovering_remember_username = true;
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.HIDE_USERNAME.get_login_screen_state()) {
					hide_username = !hide_username;
					if (!hide_username && username.length() > 0) {
						editing = 0;
						username = "";
						remembered_username = "";
						remember_username = false;
					}
					Client.current_renderer.save_preferences(Client.sign_link);
					hovering_hide_username = true;
					break;
				}
				if (button.get_login_screen_state() == LoginScreenButtons.EXISTING_ACCOUNT.get_login_screen_state()) {
					login_message_0 = "";
					login_message_1 = "Enter your username/email & password.";
					login_message_2 = "";
					username = remember_username ? remembered_username : "";
					editing = username.length() > 0 ? 1 : 0;
					password = "";
				}
				login_screen_state = button.get_login_screen_state();
				break;
			}
		}
		draw_current_state();
	}

	static final void request_login(String username_input, String password_input, int login_state_input) {
		username = username_input;
		password = password_input;
		login_state = login_state_input;
		if (username.equals("") || password.equals(""))
			Class246_Sub31.anInt5034 = 3;
		else if ((Client.world_id ^ 0xffffffff) != 0)
			Class128_Sub1.method2331(1);
		else {
			Class246_Sub31.anInt5034 = -3;
			Class_o.anInt7225 = 0;
			Class228.anInt3137 = 1;
			Class129.anInt1808 = 0;
			Buffer stream = new Buffer(128);
			stream.writeByte(255, 10);
			stream.writeInt((int) (Math.random() * 9.9999999E7), (byte) -70);
			stream.writeLong(Class246_Sub28_Sub6.method2554(1, username), (byte) -48);
			stream.writeInt((int) (9.9999999E7 * Math.random()), (byte) -63);
			stream.writeString(80, password);
			stream.writeInt((int) (Math.random() * 9.9999999E7), (byte) 109);
			stream.method2385(Class246_Sub28_Sub4.RSA_EXPONENT, (byte) -107, Class169.RSA_MODULUS);
			((Buffer) Class130_Sub1.stream).position = 0;
			Class130_Sub1.stream.writeByte(255, ((Class48) Class246_Sub1_Sub10.aClass48_6222).anInt689);
			Class130_Sub1.stream.writeByte(6745 ^ 0x1aa6, ((Buffer) stream).position + 2);
			Class130_Sub1.stream.writeShort((byte) 67, 592);
			Class130_Sub1.stream.writeBytes(0, true, (((Buffer) stream).buffer), (((Buffer) stream).position));
		}
	}

	public static boolean logged_in = true;

	static final void prepare(boolean welcome_screen_raised) {
		try {
			Class259_Sub3_Sub1.anInt6899++;
			if (welcome_screen_raised) {
				logged_in = !welcome_screen_raised;
				if ((Widget.root_interface ^ 0xffffffff) != 0) {
					Widget.reset_widget(Widget.root_interface);
				}
				for (WidgetParent class246_sub40 = (WidgetParent) Widget.get_widget_parents(193).first(
						(byte) -23); class246_sub40 != null; class246_sub40 = (WidgetParent) Widget
								.get_widget_parents(193)
								.next((byte) -20)) {
					if (!class246_sub40.method1576(-104)) {
						class246_sub40 = (WidgetParent) Widget.get_widget_parents(193).first((byte) -23);
						if (class246_sub40 == null)
							break;
					}
					Widget.close_widget(true, class246_sub40, false, -80, 193, "here4");
				}
				for (WidgetParent class246_sub40 = (WidgetParent) Widget.get_widget_parents(550).first(
						(byte) -23); class246_sub40 != null; class246_sub40 = (WidgetParent) Widget
								.get_widget_parents(550)
								.next((byte) -20)) {
					if (!class246_sub40.method1576(-104)) {
						class246_sub40 = (WidgetParent) Widget.get_widget_parents(550).first((byte) -23);
						if (class246_sub40 == null)
							break;
					}
					Widget.close_widget(true, class246_sub40, false, -80, 550, "here4");
				}
				for (WidgetParent class246_sub40 = (WidgetParent) Widget.get_widget_parents(634).first(
						(byte) -23); class246_sub40 != null; class246_sub40 = (WidgetParent) Widget
								.get_widget_parents(634)
								.next((byte) -20)) {
					if (!class246_sub40.method1576(-104)) {
						class246_sub40 = (WidgetParent) Widget.get_widget_parents(634).first((byte) -23);
						if (class246_sub40 == null)
							break;
					}
					Widget.close_widget(true, class246_sub40, false, -80, 634, "here4");
				}
				Widget.root_interface = -1;
				Widget.widget_parents = new IterableNodeHashTable(8);
				Widget.widget_parents_550 = new IterableNodeHashTable(8);
				Widget.widget_parents_osrs = new IterableNodeHashTable(8);
				IncomingPacket.method144(-19181);
				/*
				 * Widget.root_interface = 744; Class177.method1165((byte) -112, false, 550);
				 * Class205.method1341(-11712);
				 * ScriptExecutor.execute_on_load_script(Widget.root_interface, 550);
				 */
				draw();
			}
			Class69.method448(0);
			Class83.anInt1089 = -1;
			Camera.method1339(Class188.anInt2657, (byte) 127);
			Client.local_player = new Player();
			((Entity) Client.local_player).f_mc[0] = Class38_Sub1_Sub1.anInt6770 / 2;
			((Class59_Sub3) Client.local_player).y = 128 * Class152.anInt2205 / 2;
			((Class59_Sub3) Client.local_player).x = 128 * Class38_Sub1_Sub1.anInt6770 / 2;
			((Entity) Client.local_player).f_nc[0] = Class152.anInt2205 / 2;
			Class246_Sub16.aInt92 = Class259_Sub1.anInt4509 = 0;
			if (Class130_Sub3.anInt4417 == 2) {
				Class259_Sub1.anInt4509 = Class100.anInt1306 << 7;
				Class246_Sub16.aInt92 = Class78.anInt1013 << 7;
			} else
				Class246_Sub30.method2156(true);
			ParamType.method815((byte) -36);
			if (Class246_Sub16.aInt92 == 0 || (Class259_Sub1.anInt4509 ^ 0xffffffff) == -1)
				Class99.method622((byte) 78, 10);
			else {
				Stream_Sub1.method2475(-12319);
				Class99.method622((byte) -125, 28);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int login_response = 0;
}
