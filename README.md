### Install Redis

```
brew install redis
```

### Launch Redis Server

```
redis-server /usr/local/etc/redis.conf
```

### Launch Redis Browser

```
gem install redis-browser --version '~> 0.4.0'
gem install redis-browser
redis-browser
```

### Launch Redis CLI

```
redis-cli
```

### Get all keys in Redis

```
127.0.0.1:6379> keys *
```
