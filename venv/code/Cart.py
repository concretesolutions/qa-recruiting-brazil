class Encapsule:

    jiraJson = None


def __init__(self, url):
    self.url = url

    try:
        resp = requests.get(self.url, auth=HTTPBasicAuth('mitsuo.o', '50461317'))
        self.jiraJson = resp.json()

    # carrierCode = resp.json()['fields']['customfield_11949']
    # #print(carrierCode)
    except Exception as ex:
        print(ex)