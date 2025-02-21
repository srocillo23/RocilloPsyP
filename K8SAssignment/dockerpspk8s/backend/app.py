from fastapi import FastAPI # type: ignore
import os

app = FastAPI()

@app.get("/")
def read_root():
    return{"message": "HOLAAAA... para la parte 4 (v2)"}

@app.get("/status")
def status():
    return {"status": "API Running", "host": os.getenv("HOSTNAME")}