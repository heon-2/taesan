FROM python:3.9.13

WORKDIR /code

COPY ./requirements.txt /code/requirements.txt

RUN pip install --no-cache-dir --upgrade -r /code/requirements.txt

COPY ./main.py /code/main.py

COPY ./fastText /code/fastText

COPY ./final_model_02.bin /code/final_model_02.bin

RUN cd /code/fastText && pip install .

CMD ["uvicorn", "main:app", "--host", "0.0.0.0", "--port", "8099"]