// Import necessary packages

public class MainActivity extends AppCompatActivity {

    // Initialize click count and last click time variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize your media player or media session here if needed
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastClickTime < 500) {
                clickCount++;
            } else {
                clickCount = 1;
            }
            lastClickTime = currentTime;

            if (clickCount == 1) {
                // Handle play/pause button press
                handlePlayPause();
            } else if (clickCount == 2) {
                // Handle double click (next track)
                handleNextTrack();
            } else if (clickCount == 3) {
                // Handle triple click (previous track)
                handlePreviousTrack();
            }
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    // Define methods to handle different button actions

    private void handlePlayPause() {
        // Implement logic to toggle play/pause state of your media player or session
    }

    private void handleNextTrack() {
        // Implement logic to skip to the next track in your media player or session
    }

    private void handlePreviousTrack() {
        // Implement logic to go back to the previous track in your media player or session
    }
}
