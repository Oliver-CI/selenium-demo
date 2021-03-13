const express = require('express')
const app = express()
const port = normalizePort(process.env.PORT || '3000');

app.use(express.static('pages'))


app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`)
})

/**
 * Normalize a port into a number, string, or false.
 */

function normalizePort(val) {
    const port = parseInt(val, 10);

    if (isNaN(port)) {
        // named pipe
        return val;
    }

    if (port >= 0) {
        // port number
        return port;
    }

    return false;
}
