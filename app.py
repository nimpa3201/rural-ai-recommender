# app.py
from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

class RecommendRequest(BaseModel):
    age: int
    interest: str
    region: str

class RecommendResponse(BaseModel):
    recommended_region: str
    matched_policies: list[str]

@app.post("/recommend", response_model=RecommendResponse)
def recommend(req: RecommendRequest):
    return RecommendResponse(
        recommended_region="전라남도 고흥군",
        matched_policies=["청년 창업농 정착지원", "귀촌 맞춤형 주거 지원"]
    )
