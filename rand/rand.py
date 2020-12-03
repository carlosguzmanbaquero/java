import requests

from requests.exceptions import HTTPError

try:
    url = "http://localhost:8080/random?bound=5&origin=1&size=100"
    response = request.get(url)
    json = response.json()
    print('Random numbers from web service:')
    print(json)

    randNums = json['numArray']
    sum=0
    for num in randNums:
        print(num)
        sum=sum+num
    print('sum of numbers = ', sum)
except HTTPError as err:
    print(f'HTTP error ocurred:{err}')
