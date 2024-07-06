package io;

public class Boundary {
		
		private int start_x, start_y, end_x, end_y;
		
		public int get_start_x() {
			return start_x;
		}
		
		public int get_end_x() {
			return end_x;
		}
		
		public int get_start_y() {
			return start_y;
		}
		
		public int get_end_y() {
			return end_y;
		}
		
		public Boundary(final int start_x, final int end_x, final int start_y, final int end_y) {
			this.start_x = start_x;
			this.start_y = start_y;
			this.end_x = end_x;
			this.end_y = end_y;
		}
	}