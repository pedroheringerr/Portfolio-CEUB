from flask import Flask

# Setting the app name to call.
app = Flask(__name__)


# Setting where in the url the function will run.
@app.route("/")
def hello_world():
    return "<p>Hello, World!</p>"
