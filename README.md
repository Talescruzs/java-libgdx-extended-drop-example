# libGDX example: a simple game

A simple game from the libGDX wiki tutorials.

## Links
- Demo: https://libgdx.com/wiki/start/a-simple-game
- Source code: https://github.com/libgdx/libgdx-wiki-examples/tree/master/a-simple-game
  
## Running on GitHub Codespaces

1. Click on 'Code', select 'Codespaces' and click '+' to create a Codespace
2. In the terminal of the recently created Codespace:
   1. Go to the project folder
   ```
   cd gdx-1.13.0/a-simple-game
   ```
   2. Build the HTML project
   ```
   ./gradlew html:dist
   ```
   3. Run the HTML project
   ```
   cd html/build/dist
   python -m http.server
   ```
