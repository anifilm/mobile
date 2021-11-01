module.exports = {
  transpileDependencies: [
    'vuetify'
  ],
  pwa: {
    workboxOptions: {
      runtimeCaching: [
        {
          urlPattern: /\.png$/,
          handler: 'cacheFirst',
          options: {
            cacheName: 'png-cache',
            expiration: {
              maxEntries: 10, // 총 파일 10개까지 캐시
              maxAgeSeconds: 60 * 60 * 24 * 365 // 1년 캐시
            }
          }
        },
        {
          urlPattern: /\.json$/,
          handler: 'staleWhileRevalidate',
          options: {
            cacheName: 'json-cache',
            cacheableResponse: {
              statuses: [200]
            }
          }
        }
      ]
    }
  },
  devServer: {
    disableHostCheck: true
  }
};
