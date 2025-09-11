import os

MAX_DAYS = 24
START = 1

for i in range(START, MAX_DAYS + 1):
    folder_name = f'DAY_{i}/'
    file_path = f'DAY_{i}/README.MD'
    os.mkdir(folder_name)
    with open(file_path, 'x') as f: pass

